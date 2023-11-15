package com.example.myjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Practice {
    @FXML
    Label success;

    @FXML
    public void register(ActionEvent actionEvent) {
        success.setText("Registration successfulll!!");
    }
}
