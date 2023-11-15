module com.example.randomnumbergenerator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.randomnumbergenerator to javafx.fxml;
    exports com.example.randomnumbergenerator;
}