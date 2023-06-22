module Responsible.Calculatoor {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;

    exports org.main to javafx.fxml, javafx.graphics, javafx.controls;
    exports org.charts to javafx.fxml, javafx.graphics, javafx.controls;

    opens org.main to javafx.fxml;
    opens org.charts to javafx.fxml;
}