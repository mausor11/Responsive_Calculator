package org.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }
    private Stage stage = StageInstance.getStage();
    @Override
    public void start(Stage stage) throws IOException {

        stage.setMinWidth(400);
        stage.setMinHeight(700);

        stage.setTitle("Calculator");
        Scene scene = new Scene(new FXMLLoader(Main.class.getResource("Main.fxml")).load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        stage.setScene(scene);
        stage.setWidth(505);
        stage.setHeight(700);
        stage.show();

//        Scene scene1 = new Scene(new FXMLLoader(Main.class.getResource("Main2.fxml")).load());
//        scene1.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
//
//        stage.setScene(scene);
//
//        stage.widthProperty().addListener(new ChangeListener<Number>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
//                if(newValue.doubleValue() > 1000) {
//                    stage.setScene(scene1);
//                } else {
//                    stage.setScene(scene);
//                }
//            }
//        });

    }
}