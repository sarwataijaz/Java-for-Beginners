package com.example.myjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
// make sure to select the helloController class in the Controller panel of scene builder
    @FXML
    Label success;

    @FXML
    protected void clickButton(ActionEvent actionEvent) {
        success.setText("Registration successfulll!!");
    }
}