package org.charts;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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
    @FXML
    public Hyperlink hyperlink;
    private double transitional;
    public void initialize() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        hyperlink.setText("Last update: " + zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm z")));
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

    public void changeUpdate(ActionEvent actionEvent) {
        initialize();
    }
}
