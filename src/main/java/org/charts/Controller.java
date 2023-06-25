package org.charts;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

import static org.main.MainControllers.multiplicity;

public class Controller {
    @FXML
    public MenuButton menuCurrency;
    @FXML
    public ListView<Object> listCurrency;
    @FXML
    public ScrollPane scrollPane;
    private double transitional;
    public void initialize() {

        Map<String, String> currency = Currency.getCurrencyTable();
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
        UpdateList.updateList(listCurrency,1, multiplicity);


    }

}
