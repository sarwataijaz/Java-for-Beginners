module com.example.switchscenes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.switchscenes to javafx.fxml;
    exports com.example.switchscenes;
}