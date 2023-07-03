package org.main;

import javafx.animation.FillTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import org.charts.UpdateList;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MainControllers {
    public static double multiplicity = 1;
    public void zeroListener() {
        if(isEquation) {
            scoreField.setText("0");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (!scoreField.getText().equals("0")) {
                    scoreField.setText(scoreField.getText() + "0");
                }
            }
        }
    }
    public void oneListener() {
        if(isEquation) {
            scoreField.setText("1");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("1");
                } else {
                    scoreField.setText(scoreField.getText() + "1");

                }
            }
        }
    }
    public void twoListener() {
        if(isEquation) {
            scoreField.setText("2");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("2");
                } else {
                    scoreField.setText(scoreField.getText() + "2");

                }
            }
        }
    }
    public void threeListener() {
        if(isEquation) {
            scoreField.setText("3");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("3");
                } else {
                    scoreField.setText(scoreField.getText() + "3");

                }
            }
        }
    }
    public void fourListener() {
        if(isEquation) {
            scoreField.setText("4");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("4");
                } else {
                    scoreField.setText(scoreField.getText() + "4");

                }
            }
        }
    }
    public void fiveListener() {
        if(isEquation) {
            scoreField.setText("5");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("5");
                } else {
                    scoreField.setText(scoreField.getText() + "5");

                }
            }
        }
    }
    public void sixListener() {
        if(isEquation) {
            scoreField.setText("6");
            isEquation = false;
        } else {
            if (scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("6");
                } else {
                    scoreField.setText(scoreField.getText() + "6");

                }
            }
        }
    }
    public void sevenListener() {
        if(isEquation) {
            scoreField.setText("7");
            isEquation = false;
        } else {
        if(scoreField.getText().length() < 11) {
            if (scoreField.getText().equals("0")) {
                scoreField.setText("7");
            } else {
                scoreField.setText(scoreField.getText() + "7");

            }
        }
        }
    }
    public void eightListener() {
        if(isEquation) {
            scoreField.setText("8");
            isEquation = false;
        } else {
            if(scoreField.getText().length() < 11) {
                if (scoreField.getText().equals("0")) {
                    scoreField.setText("8");
                } else {
                    scoreField.setText(scoreField.getText() + "8");

                }
            }
        }

    }
    public void nineListener() {
        if(isEquation) {
            scoreField.setText("9");
            isEquation = false;
        } else {
            if(scoreField.getText().length() < 11) {
                if(scoreField.getText().equals("0")) {
                    scoreField.setText("9");
                } else {
                    scoreField.setText(scoreField.getText() + "9");

                }
            }
        }


    }
    public void equalsListener() {
        isPlus = true;
        if(!isEquation) {
            if(whatPart == 1) {
                waitingScore.setText(firstPart + "" + sign + "" + scoreField.getText() + "=");
                if(sign == '+') {
                    double secondPart = Double.parseDouble(scoreField.getText());
                    double firstPart = Double.parseDouble(this.firstPart);
                    double q = firstPart + secondPart;
                    DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                    df.setMaximumFractionDigits(6);
                    scoreField.setText(df.format(q) + "");
                    if(q > 0) {
                        UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                        if(MainControllers.ModeType.getText().equals("dark")) {
                        UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                    } else {
                        UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                    }
                    }

                } else if(sign == '-') {
                    double secondPart = Double.parseDouble(scoreField.getText());
                    double firstPart = Double.parseDouble(this.firstPart);
                    double q = firstPart - secondPart;
                    DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                    df.setMaximumFractionDigits(6);
                    scoreField.setText(df.format(q) + "");
                    if(q > 0) {
                        UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                        if(MainControllers.ModeType.getText().equals("dark")) {
                        UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                    } else {
                        UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                    }
                    }

                } else if(sign == '*') {
                    double secondPart = Double.parseDouble(scoreField.getText());
                    double firstPart = Double.parseDouble(this.firstPart);
                    double q = firstPart * secondPart;
                    DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                    df.setMaximumFractionDigits(6);
                    scoreField.setText(df.format(q) + "");
                    if(q > 0) {
                        UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                        if(MainControllers.ModeType.getText().equals("dark")) {
                        UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                    } else {
                        UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                    }
                    }



                } else if(sign == '÷') {
                    double secondPart = Double.parseDouble(scoreField.getText());
                    if(secondPart != 0) {
                        double firstPart = Double.parseDouble(this.firstPart);
                        double q = firstPart / secondPart;
                        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                        df.setMaximumFractionDigits(6);
                        scoreField.setText(df.format(q) + "");
                        if(q > 0) {
                            UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                            if(MainControllers.ModeType.getText().equals("dark")) {
                        UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                    } else {
                        UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                    }
                        }


                    } else {
                        scoreField.setText("Can't divide by 0");
                    }
                }
                whatPart = 0;
            } else {
                waitingScore.setText(scoreField.getText() + "=");
                double tmp = Double.parseDouble(scoreField.getText());
                if(tmp > 0) {
                    UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                    if(MainControllers.ModeType.getText().equals("dark")) {
                        UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                    } else {
                        UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                    }
                }

            }
            isEquation = true;
        }
    }

    public void cListener() {
        isPlus = true;
        scoreField.setText("0");
        waitingScore.setText("");
        whatPart=0;
    }
    public void dotListener() {
        if(isEquation) {
            scoreField.setText(".");
            isEquation = false;
        } else {
            if(scoreField.getText().length() < 11) {
                if(scoreField.getText().equals("0")) {
                    scoreField.setText("0.");
                } else {
                    scoreField.setText(scoreField.getText() + ".");

                }
            }
        }
    }
    public void backListener() {
        String tmp = scoreField.getText();
        if(tmp.length() > 1) {
            tmp = tmp.substring(0, scoreField.getText().length() - 1);
            if(tmp.equals("-")) {
                scoreField.setText("0");
            } else {
                scoreField.setText(tmp);
            }
        } else {
            scoreField.setText("0");
        }
        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(6);
        double t = Double.parseDouble(scoreField.getText());
        if(t > 0 ) {
            UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
            if(MainControllers.ModeType.getText().equals("dark")) {
                UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
            } else {
                UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

            }
        }


    }
    public void revListener() {
        isPlus = true;
        waitingScore.setText("1/" + scoreField.getText());
        double score = Double.parseDouble(scoreField.getText());
        if(score == 0) {
            scoreField.setText("Can't divide by 0");
        } else {
            double tmp = 1/score;
            DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            df.setMaximumFractionDigits(6);
            scoreField.setText(df.format(tmp) + "");
            if(tmp > 0) {
                UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
                if(MainControllers.ModeType.getText().equals("dark")) {
                    UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
                } else {
                    UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

                }
            }
        }


    }

    public void plusListener() {
        sign = '+';
        isEquation = true;
        isPlus = true;
        if(whatPart == 0) {
            whatPart++;
        }
        firstPart = scoreField.getText();
        waitingScore.setText(scoreField.getText() + sign);
    }

    public void minusListener() {
        sign = '-';
        isEquation = true;
        isPlus = true;
        if(whatPart == 0) {
            whatPart++;
        }
        firstPart = scoreField.getText();
        waitingScore.setText(scoreField.getText() + sign);
    }

    public void multiListener() {
        sign = '*';
        isEquation = true;
        isPlus = true;
        if(whatPart == 0) {
            whatPart++;
        }
        firstPart = scoreField.getText();
        waitingScore.setText(scoreField.getText() + sign);
    }
    public void powerListener() {
        waitingScore.setText(scoreField.getText() + "²");
        double score = Double.parseDouble(scoreField.getText());
        double tmp = Math.pow(score,2);

        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(6);
        scoreField.setText(df.format(tmp) + "");
        if(tmp > 0) {
            UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
            if(MainControllers.ModeType.getText().equals("dark")) {
                UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
            } else {
                UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

            }
        }

    }
    public void sqrListener() {
        waitingScore.setText("√(" + scoreField.getText() + ")");
        double score = Double.parseDouble(scoreField.getText());
        double tmp = Math.sqrt(score);

        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(6);
        scoreField.setText(df.format(tmp) + "");
        if(tmp > 0) {
            UpdateList.multiplicity = Double.parseDouble(scoreField.getText());
            if(MainControllers.ModeType.getText().equals("dark")) {
                UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
            } else {
                UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);

            }
        }
    }

    public void divideListener() {
        sign = '÷';
        isEquation = true;
        isPlus = true;
        if(whatPart == 0) {
            whatPart++;
        }
        firstPart = scoreField.getText();
        waitingScore.setText(scoreField.getText() + sign);
    }
    public void changeListener() {
        if(isPlus) {
            if(!scoreField.getText().equals("0")) {
                scoreField.setText("-" + scoreField.getText());
                isPlus = false;
            }
        } else {
            if(!scoreField.getText().equals("0")) {
                String tmp = scoreField.getText();
                tmp = tmp.substring(1, scoreField.getText().length());
                scoreField.setText(tmp);
                isPlus = true;
            }
        }
    }
    char sign;
    boolean isPlus = true;
    boolean isEquation = false;
    String firstPart;
    int whatPart = 0;
    enum Mode{LIGHT, DARK}
    public static Label ModeType = new Label("dark");
    Mode actualMode = Mode.DARK;
    @FXML
    public Label scoreField;
    @FXML
    public Label waitingScore;
    @FXML
    public Label upText;
    @FXML
    public Rectangle onOffSwitch;
    @FXML
    public Circle onOffCircle;
    @FXML
    public VBox container;
    @FXML
    public Button buttonNum1;
    @FXML
    public Button buttonNum2;
    @FXML
    public Button buttonNum3;
    @FXML
    public Button buttonNum4;
    @FXML
    public Button buttonNum5;
    @FXML
    public Button buttonNum6;
    @FXML
    public Button buttonNum7;
    @FXML
    public Button buttonNum8;
    @FXML
    public Button buttonNum9;
    @FXML
    public Button buttonC;
    @FXML
    public Button buttonChange;
    @FXML
    public Button buttonDiv;
    @FXML
    public Button buttonMulti;
    @FXML
    public Button buttonRej;
    @FXML
    public Button buttonAdd;
    @FXML
    public Button buttonNum0;
    @FXML
    public Button buttonDot;
    @FXML
    public Button buttonEq;
    @FXML
    public Button buttonRev;
    @FXML
    public Button buttonPwr;
    @FXML
    public Button buttonSqr;
    @FXML
    public Button buttonBack;

    @FXML
    public void changeMode() {
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(100), onOffCircle);
        if(actualMode == Mode.DARK) {

            FillTransition fillTransition = new FillTransition(Duration.millis(100), onOffSwitch);
            FillTransition fillTransition2 = new FillTransition(Duration.millis(100), onOffCircle);
            MainControllers.ModeType.setText("light");
            translateTransition.setToX(-onOffCircle.getRadius()*2);
            container.lookup(".container").setStyle("-fx-background-color: #d1e8db");
            upText.setStyle("-fx-text-fill: #439f6d");
            scoreField.lookup(".scoreField").setStyle("-fx-background-color: #e8ffe8; -fx-text-fill: #333333");
            waitingScore.lookup(".waitingScore").setStyle("-fx-background-color: #e8ffe8; -fx-text-fill: #333333");
            buttonNum1.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8; -fx-text-fill: #333333");
            buttonBack.lookup("#backButton").setStyle("-fx-text-fill: #333333");
            buttonEq.lookup("#equals").setStyle("-fx-text-fill: #333333");
            buttonNum2.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum3.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum4.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum5.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum6.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum7.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum8.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum9.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonNum0.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonDot.lookup(".CalcButton").setStyle("-fx-background-color: #e8ffe8;; -fx-text-fill: #333333");
            buttonC.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonChange.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonAdd.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonRej.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonRev.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonDiv.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonMulti.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonSqr.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            buttonPwr.lookup(".CalcButtonEq").setStyle("-fx-background-color: #dcfcdc;; -fx-text-fill: #333333");
            UpdateList.updateListLightMode(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
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
            MainControllers.ModeType.setText("dark");

            FillTransition fillTransition = new FillTransition(Duration.millis(100), onOffSwitch);
            FillTransition fillTransition2 = new FillTransition(Duration.millis(100), onOffCircle);
            container.setStyle("-fx-background-color: #222222");
            upText.setStyle("-fx-text-fill: #61c28d");
            scoreField.lookup(".scoreField").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
            waitingScore.lookup(".waitingScore").setStyle("-fx-background-color: #222222; -fx-text-fill: white");
            buttonNum1.lookup(".CalcButton").setStyle("-fx-background-color: #333333; -fx-text-fill: white");
            buttonBack.lookup("#backButton").setStyle("-fx-text-fill: white");
            buttonEq.lookup("#equals").setStyle("-fx-text-fill: white");
            buttonNum2.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum3.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum4.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum5.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum6.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum7.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum8.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum9.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonNum0.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonDot.lookup(".CalcButton").setStyle("-fx-background-color: #333333;; -fx-text-fill: white");
            buttonC.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonChange.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonAdd.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonRej.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonRev.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonDiv.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonMulti.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonSqr.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            buttonPwr.lookup(".CalcButtonEq").setStyle("-fx-background-color: #444444;; -fx-text-fill: white");
            UpdateList.updateList(UpdateList.instance, UpdateList.transitional, UpdateList.multiplicity);
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
