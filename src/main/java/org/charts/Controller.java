package org.charts;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;

import java.util.Map;

public class Controller {
    @FXML
    public MenuButton menuCurrency;
    @FXML
    public ListView<Object> listCurrency;
    @FXML
    public ScrollPane scrollPane;
    public void initialize() {
        Map<String, String> currency = Currency.getCurrencyTable();
        for(String curr : currency.keySet()) {
            MenuItem item = new MenuItem(curr);
            item.setOnAction(event -> {
                System.out.println(item.getText() + " " + currency.get(item.getText()));
                menuCurrency.setText(item.getText());
            });
            menuCurrency.getItems().add(item);
        }
        listCurrency.getItems().addAll(FXCollections.observableArrayList(currency.keySet()));
    }

}
