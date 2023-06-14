module Responsible.Calculatoor {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports org.main to javafx.fxml, javafx.graphics, javafx.controls;

    opens org.main to javafx.fxml;
}