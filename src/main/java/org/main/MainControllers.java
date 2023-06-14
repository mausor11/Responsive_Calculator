package org.main;

import javafx.animation.FillTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class MainControllers {

    enum Mode{LIGHT, DARK}
    Mode actualMode = Mode.DARK;
    @FXML
    public TextArea scoreField;
    @FXML
    public Label upText;
    @FXML
    public Rectangle onOffSwitch;
    @FXML
    public Circle onOffCircle;
    @FXML
    public VBox container;

    @FXML
    public void changeMode(MouseEvent event) {
        if(actualMode == Mode.DARK) {
            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(100), onOffCircle);

            FillTransition fillTransition = new FillTransition(Duration.millis(100), onOffSwitch);
            FillTransition fillTransition2 = new FillTransition(Duration.millis(100), onOffCircle);

            translateTransition.setToX(-onOffCircle.getRadius()*2);
            container.setStyle("-fx-background-color: #d1e8db");
            upText.setStyle("-fx-text-fill: #439f6d");
            scoreField.lookup(".scoreField .content").setStyle("-fx-background-color: #333333;\n" +
                    "    -fx-background-radius: 0;\n" +
                    "    -fx-border-width: 2;\n" +
                    "    -fx-border-color: #61c28d;\n" +
                    "    -fx-border-radius: 0;");
            fillTransition.setFromValue(Color.web("#61c28d"));
            fillTransition2.setFromValue(Color.web("#c9ecd9"));

            fillTransition.setToValue(Color.web("white"));
            fillTransition2.setToValue(Color.web("#61c28d"));

            fillTransition.setAutoReverse(false);
            fillTransition2.setAutoReverse(false);

            translateTransition.setAutoReverse(false);
            translateTransition.play();

            fillTransition.play();
            fillTransition2.play();
            actualMode = Mode.LIGHT;
        } else {
            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(100), onOffCircle);

            FillTransition fillTransition = new FillTransition(Duration.millis(100), onOffSwitch);
            FillTransition fillTransition2 = new FillTransition(Duration.millis(100), onOffCircle);
            container.setStyle("-fx-background-color: #222222");
            upText.setStyle("-fx-text-fill: #61c28d");
            scoreField.lookup(".scoreField .content").setStyle("-fx-background-color: #333333");

            translateTransition.setToX(0);
            fillTransition.setFromValue(Color.web("white"));
            fillTransition2.setFromValue(Color.web("#61c28d"));
            fillTransition.setToValue(Color.web("#61c28d"));
            fillTransition2.setToValue(Color.web("white"));
            fillTransition.setAutoReverse(false);
            fillTransition2.setAutoReverse(false);
            translateTransition.setAutoReverse(false);
            translateTransition.play();
            fillTransition.play();
            fillTransition2.play();
            onOffCircle.setStyle("-fx-fill: white");
            actualMode = Mode.DARK;
        }
    }
}
