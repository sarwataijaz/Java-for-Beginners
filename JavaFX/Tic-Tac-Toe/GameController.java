package com.example.tictactoe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController {

    String player1 = "";
    String player2 = "";
    @FXML
    Label nameLabel;


    public void setPlayers(ActionEvent event, String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        nameLabel.setText(player1);
    }
    @FXML
    public void clickCells(ActionEvent event) {

        Button selectedCell = (Button) event.getSource();

        if(nameLabel.getText().equals(player1)) {
            selectedCell.setStyle("-fx-text-fill: #e62828");
            selectedCell.setText("X");
            nameLabel.setText(player2);
        } else {
            selectedCell.setStyle("-fx-text-fill: #8f3207");
            selectedCell.setFont(new Font(71));
            selectedCell.setText("O");
            nameLabel.setText(player1);
        }

    }


}
