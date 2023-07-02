package org.charts;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.main.MainControllers;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static org.main.MainControllers.multiplicity;

public class Controller {
    @FXML
    public MenuButton menuCurrency;
    @FXML
    public ListView<Object> listCurrency;
    @FXML
    public ScrollPane scrollPane;
    @FXML
    public Hyperlink hyperlink;
    @FXML
    public VBox container;
    private double transitional;
    public void initialize() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        hyperlink.setText("Last update: " + zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm z")));
        Map<String, String> currency = Currency.getCurrencyTable();
        if(currency != null) {
            for(String curr : currency.keySet()) {
                MenuItem item = new MenuItem(curr);
                item.setOnAction(event -> {
                    double c = Double.parseDouble(currency.get(item.getText()));
                    transitional = 1/c;
                    UpdateList.updateList(listCurrency,transitional, multiplicity);
                    menuCurrency.setText(item.getText());
                });
                menuCurrency.getItems().add(item);
            }
            MenuItem itemusd = new MenuItem("United States Dollar");
            itemusd.setOnAction(event -> {
                UpdateList.updateList(listCurrency,1, multiplicity);
                menuCurrency.setText(itemusd.getText());
            });
            menuCurrency.getItems().add(itemusd);
            UpdateList.updateList(listCurrency,1, multiplicity);
        } else {
            menuCurrency.getItems().clear();
            UpdateList.updateList(listCurrency,1,multiplicity);
        }
        MainControllers.ModeType.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
                if(newText.equals("light")) {
                    container.lookup(".container").setStyle("-fx-background-color: #d1e8db; -fx-text-fill: #333333");
                    listCurrency.lookup(".listCurrency .list-cell").setStyle("-fx-background-color: #d1e8db; -fx-text-fill: #333333");
                    scrollPane.lookup(".scrollPane").setStyle("-fx-background-color: #d1e8db; -fx-text-fill: #333333");
                    scrollPane.lookup(".scrollPane .scroll-bar").setStyle("-fx-background-color: #d1e8db; -fx-text-fill: #333333");
                    scrollPane.lookup(".scrollPane > .scroll-bar:vertical").setStyle("-fx-background-color: #d1e8db; -fx-text-fill: #333333");
                } else {
                    container.lookup(".container").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
                    listCurrency.lookup(".listCurrency .list-cell").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
                    scrollPane.lookup(".scrollPane").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
                    scrollPane.lookup(".scrollPane .scroll-bar").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
                    scrollPane.lookup(".scrollPane > .scroll-bar:vertical").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
                }
            }
        });

    }
    public void changeUpdate(ActionEvent actionEvent) {
        transitional = UpdateList.transitional;
        multiplicity = UpdateList.multiplicity;
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        hyperlink.setText("Last update: " + zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm z")));
        Map<String, String> currency = Currency.getCurrencyTable();
        for(String curr : currency.keySet()) {
            MenuItem item = new MenuItem(curr);
            item.setOnAction(event -> {
                UpdateList.updateList(listCurrency,transitional, multiplicity);
                menuCurrency.setText(item.getText());
            });
            menuCurrency.getItems().add(item);
        }
        UpdateList.updateList(listCurrency,transitional, multiplicity);
    }
}
