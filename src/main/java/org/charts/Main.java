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
        Scene scene = new Scene(new FXMLLoader(Main.class.getResource("Charts.fxml")).load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());

        stage.setScene(scene);
        stage.setWidth(300);
        stage.setHeight(700);
        stage.show();
    }
}
