package org.main;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }
    private Stage stage = StageInstance.getStage();
    private HBox hbox = new HBox();
    @Override
    public void start(Stage stage) throws IOException {
        stage.setMinWidth(400);
        stage.setMinHeight(700);
        stage.setTitle("Calculator");
        Scene scene = new Scene(new FXMLLoader(Main.class.getResource("Main.fxml")).load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        stage.setWidth(505);
        stage.setHeight(700);
        stage.show();

        Scene scene1 = new Scene(new FXMLLoader(org.charts.Main.class.getResource("Charts.fxml")).load());
        scene1.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        hbox.getChildren().add(scene.getRoot());
        hbox.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        Scene newScene = new Scene(hbox);
        stage.setScene(newScene);
        stage.widthProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                if(newValue.doubleValue() > 1000) {
                    hbox.getChildren().clear();
                    hbox.getChildren().addAll(scene.getRoot(), scene1.getRoot());
                } else {
                    hbox.getChildren().clear();
                    hbox.getChildren().add(scene.getRoot());
                }
            }
        });

    }
}