package org.charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Main extends Application {
    @FXML
    public MenuButton menuCurrency;
    public static void main(String[] args) throws IOException {
        launch();

    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setMinWidth(300);
        stage.setMinHeight(700);
        stage.setTitle("Calculator");

//        Map<String,String> currency = Currency.getCurrencyTable();
//        MenuButton menuCurrency = new MenuButton("Choose currency");
//
//        for(String curr : currency.keySet()) {
//            MenuItem item = new MenuItem(curr);
//            item.setOnAction(event -> {
//                System.out.println(item.getText() + " " + currency.get(item.getText()));
//                menuCurrency.setText(item.getText());
//            });
//            menuCurrency.getItems().add(item);
//        }
//
//
//
        Map<String, String> currency = Currency.getCurrencyTable();

//        Label title = new Label();
//        title.setText("Currency");
//        title.getStyleClass().add("textCurrency");
//
//        Label txt = new Label("Choose currency");
//        txt.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");
//        menuCurrency.getStyleClass().add("menuButton");
//        menuCurrency.setGraphic(txt);
        for(String curr : currency.keySet()) {
            MenuItem item = new MenuItem(curr);
            item.setOnAction(event -> {
                System.out.println(item.getText() + " " + currency.get(item.getText()));
                menuCurrency.setText(item.getText());
            });
            menuCurrency.getItems().add(item);
        }
//        ListView<String> listCurrency = new ListView<>(FXCollections.observableArrayList(currency.keySet()));
//        ScrollPane scrollPane = new ScrollPane();
//        scrollPane.setContent(listCurrency);
//        scrollPane.setFitToHeight(true);
//        VBox vbox = new VBox(title, menuCurrency, listCurrency);
//        vbox.getStyleClass().add("container");
//        vbox.setFillWidth(true);
//        vbox.setSpacing(10);
        Scene scene = new Scene(new FXMLLoader(Main.class.getResource("Charts.fxml")).load());




        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());

        stage.setScene(scene);
        stage.setWidth(300);
        stage.setHeight(700);
        stage.show();
    }
}
