module com.example.info {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.info to javafx.fxml;
    exports com.example.info;
}