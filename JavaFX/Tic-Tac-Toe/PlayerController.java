package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayerController {
    @FXML
    Label errorLabel;
    @FXML
    TextField player1;
    @FXML
    TextField player2;
    @FXML
    Button playButton;

    private Stage stage;
    private Parent root;
    @FXML
    public void onPlayButton(ActionEvent event) throws IOException {
        String play1 = player1.getText();
        String play2 = player2.getText();

        if(play1.isEmpty() || play2.isEmpty()) {
            errorLabel.setText("Please enter names for both players.");
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            root = loader.load();
            String css = this.getClass().getResource("style.css").toExternalForm();

            Scene scene = new Scene(root,800,600);
            scene.getStylesheets().add(css);

            GameController controller = loader.getController();
            controller.setPlayers(event, play1, play2);
            controller.setPreScene(playButton.getScene());

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

}
