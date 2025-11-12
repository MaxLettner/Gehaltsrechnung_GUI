module at.htl.gehaltsrechnung {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.htl.gehaltsrechnung to javafx.fxml;
    exports at.htl.gehaltsrechnung;
}