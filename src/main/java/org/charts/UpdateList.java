package org.charts;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

public class UpdateList {
    public static double multiplicity = 1;
    public static ListView<Object> instance;
    public static double transitional;
    public static Map<String, String> currency;
    public static ListView<Object> updateList(ListView<Object> listCurrency, double transitional, double muliplicity) {
        listCurrency.getStyleClass().clear();
        listCurrency.getStyleClass().add("listCurrency");

        Map<String, String> currency = Currency.getCurrencyTable();
        UpdateList.currency = currency;
        if(currency != null) {
            listCurrency.getItems().clear();
            HBox hboxUSD = new HBox();
            hboxUSD.getStyleClass().add("listCall");
            Label label = new Label("United States Dollar");
            label.setPrefWidth(80);
            label.setWrapText(true);
            label.setStyle("-fx-text-fill:  #61c28d; -fx-font-weight: bold");
            Label label1 = new Label();
            DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            df.setMaximumFractionDigits(4);
            label1.setText(df.format(transitional*multiplicity) + "");
            label1.setStyle("-fx-text-fill:  white; -fx-font-size: 15");
            label1.setPrefWidth(80);
            hboxUSD.getChildren().addAll(label, label1);
            listCurrency.getItems().add(hboxUSD);
            for(String curr : currency.keySet()) {
                HBox hbox = new HBox();
                hbox.getStyleClass().add("listCall");
                label = new Label(curr);
                label.setPrefWidth(80);
                label.setWrapText(true);
                label.setStyle("-fx-text-fill:  #61c28d; -fx-font-weight: bold");
                label1 = new Label();
                Double currNum = Double.parseDouble(currency.get(curr));
                currNum *= transitional;
                currNum *= muliplicity;
                df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                df.setMaximumFractionDigits(4);
                label1.setText(df.format(currNum) + "");
                label1.setStyle("-fx-text-fill:  white; -fx-font-size: 15");
                label1.setPrefWidth(80);
                hbox.getChildren().addAll(label, label1);
                listCurrency.getItems().add(hbox);
            }
            UpdateList.multiplicity = multiplicity;
            UpdateList.instance = listCurrency;
            UpdateList.transitional = transitional;

        } else {
            listCurrency.getItems().clear();
            Label label = new Label("No connection");
            label.setAlignment(Pos.CENTER);
            label.setWrapText(true);
            label.setStyle("-fx-text-fill:  #61c28d; -fx-font-weight: bold");
            listCurrency.getItems().add(label);
        }

        return listCurrency;
    }
    public static ListView<Object> updateListLightMode(ListView<Object> listCurrency, double transitional, double muliplicity) {
        Map<String, String> currency = Currency.getCurrencyTable();
        UpdateList.currency = currency;
        if(currency != null) {
            listCurrency.getItems().clear();
            HBox hboxUSD = new HBox();
            hboxUSD.getStyleClass().add("listCall");
            Label label = new Label("United States Dollar");
            label.setPrefWidth(80);
            label.setWrapText(true);
            label.setStyle("-fx-text-fill:  #222222; -fx-font-weight: bold");
            Label label1 = new Label();
            DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            df.setMaximumFractionDigits(4);
            label1.setText(df.format(transitional*multiplicity) + "");
            label1.setStyle("-fx-text-fill:  #222222; -fx-font-size: 15");
            label1.setPrefWidth(80);
            hboxUSD.getChildren().addAll(label, label1);
            hboxUSD.setStyle("-fx-background-color: #e8ffe8");
            listCurrency.getItems().add(hboxUSD);
            for(String curr : currency.keySet()) {
                HBox hbox = new HBox();
                hbox.getStyleClass().add("listCall");
                hbox.lookup(".listCall").setStyle("-fx-background-color: #e8ffe8");
                label = new Label(curr);
                label.setPrefWidth(80);
                label.setWrapText(true);
                label.setStyle("-fx-text-fill:  #222222; -fx-font-weight: bold");
                label1 = new Label();
                Double currNum = Double.parseDouble(currency.get(curr));
                currNum *= transitional;
                currNum *= muliplicity;
                df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                df.setMaximumFractionDigits(4);
                label1.setText(df.format(currNum) + "");
                label1.setStyle("-fx-text-fill:  #222222; -fx-font-size: 15");
                label1.setPrefWidth(80);
                hbox.getChildren().addAll(label, label1);
//                listCurrency.lookup(".listCurrency .list-cell").setStyle("-fx-background-color: #e8ffe8");
                listCurrency.getStyleClass().add("listCurrencyLight");
                listCurrency.getItems().add(hbox);
            }
            listCurrency.setStyle("-fx-background-color: #e8ffe8");
            UpdateList.multiplicity = multiplicity;
            UpdateList.instance = listCurrency;
            UpdateList.transitional = transitional;
        } else {
            listCurrency.getItems().clear();
            Label label = new Label("No connection");
            label.setAlignment(Pos.CENTER);
            label.setWrapText(true);
            label.setStyle("-fx-text-fill:  #61c28d; -fx-font-weight: bold");
            listCurrency.getItems().add(label);
        }
        return listCurrency;
    }



}
