package com.example.info;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class HelloController {

    @FXML
    private ColorPicker pickColor;
    @FXML
    private DatePicker pickDate;
    @FXML
    private AnchorPane pane;
    @FXML
    private TextField nameField;
    @FXML
    private TextField numField;
    @FXML
    private TextField emailField;
    @FXML
    private TextArea myArea;

        // storing info
    String selectedDate;
    String name;
    String rollNum;
    String email;

    public void dataReveal() {

        try {
            LocalDate date = pickDate.getValue();
            selectedDate = date.toString();
                name = nameField.getText();
                rollNum = numField.getText();
                email = emailField.getText();

        } catch (NullPointerException e) {
            myArea.setText("FILL UP ALL SECTIONS!!!!");
        }

        if(selectedDate.isEmpty() || name.isEmpty() || rollNum.isEmpty() || email.isEmpty()) {
                myArea.setText("FILL UP ALL SECTIONS!!!!");
            } else {

                StringBuilder sb = new StringBuilder();
                sb.append("Name: " + name + "\n");
                sb.append("ROll#: " + rollNum + "\n");
                sb.append("Email: " + email + "\n");
                sb.append("DOB: " + selectedDate);

                myArea.setText(sb.toString());
            }

    }

    public void setColor() {

        Color color = pickColor.getValue();

        pane.setBackground(new Background(new BackgroundFill(color,null,null)));
    }

}