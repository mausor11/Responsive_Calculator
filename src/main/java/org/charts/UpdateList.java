package org.charts;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

public class UpdateList {
    public static ListView<Object> updateList(ListView<Object> listCurrency, double transitional, double muliplicity) {
        Map<String, String> currency = Currency.getCurrencyTable();
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
        label1.setText(df.format(transitional) + "");
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
        return listCurrency;
    }
}