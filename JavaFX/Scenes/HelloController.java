package com.example.javafxscenes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.lang.reflect.Field;

public class HelloController {

    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;

    @FXML
    private Label successLabel;

    @FXML

    protected void loginButton() {

        String name = userField.getText();
        String pass = passField.getText();
        if(name.isEmpty() || pass.isEmpty()) {
            successLabel.setText("Enter the data firstt!!");
        } else {
            successLabel.setText("Registration successful!");
        }
    }
}



//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
