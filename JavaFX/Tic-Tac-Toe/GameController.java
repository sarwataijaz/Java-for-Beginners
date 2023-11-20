package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {

    String player1 = "";
    String player2 = "";
    @FXML
    TextField nameLabel;
    @FXML
    GridPane gridLayout;

    public void setPlayers(ActionEvent event, String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        nameLabel.setText(player1);
    }
    @FXML
    public void clickCells(ActionEvent event) {

        Button selectedCell = (Button) event.getSource();
        if(selectedCell.getText().isEmpty()) {
            selectedCell.setDisable(false);
            try {
                if (nameLabel.getText().equals(player1)) {
                    selectedCell.setStyle("-fx-text-fill: #e62828");
                    selectedCell.setText("X");
                    checkResult(event);
                    nameLabel.setText(player2);
                } else {
                    selectedCell.setStyle("-fx-text-fill: #8f3207");
                    selectedCell.setText("O");
                    checkResult(event);
                    nameLabel.setText(player1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            selectedCell.setDisable(true);
        }

    }

    @FXML
    Button button00;
    @FXML
    Button button10;
    @FXML
    Button button20;
    @FXML
    Button button01;
    @FXML
    Button button11;
    @FXML
    Button button21;
    @FXML
    Button button02;
    @FXML
    Button button12;
    @FXML
    Button button22;
    @FXML
    public void checkResult(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DialogLayout.fxml"));
        Parent dialogContent = fxmlLoader.load();

        DialogController controller = fxmlLoader.getController();
        controller.setMyLabel2("Game Overrrr!!! ");
        controller.setImage(new Image("D:/girl.png"), -12,-26);

        // Create a new Stage
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);


        String text00 = button00.getText();
        String text10 = button10.getText();
        String text20 = button20.getText();
        String text01 = button01.getText();
        String text11 = button11.getText();
        String text21 = button21.getText();
        String text02 = button02.getText();
        String text12 = button12.getText();
        String text22 = button22.getText();

        if(!text00.isEmpty() && !text10.isEmpty() && !text20.isEmpty() && text00.equals(text10) && text10.equals(text20)) {

            if(text00.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if(!text01.isEmpty() && !text11.isEmpty() && !text21.isEmpty() && text01.equals(text11) && text11.equals(text21)) {

            if(text01.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if(!text02.isEmpty() && !text12.isEmpty() && !text22.isEmpty() && text02.equals(text12) && text12.equals(text22)) {

            if(text02.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if(!text00.isEmpty() && !text01.isEmpty() && !text02.isEmpty() && text00.equals(text01) && text01.equals(text02)) {

            if(text00.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if(!text10.isEmpty() && !text11.isEmpty() && !text12.isEmpty() && text10.equals(text11) && text11.equals(text12)) {

            if(text10.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }
        else if(!text20.isEmpty() && !text21.isEmpty() && !text22.isEmpty() && text20.equals(text21) && text21.equals(text22)) {

            if(text20.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if(!text00.isEmpty() && !text11.isEmpty() && !text22.isEmpty() && text00.equals(text11) && text11.equals(text22)) {

            if(text00.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }
        else if(!text02.isEmpty() && !text11.isEmpty() && !text20.isEmpty() && text02.equals(text11) && text11.equals(text20)) {

            if(text02.equals("O")) {
                controller.setMyLabel1(player2 + " wonnnn!!!");
            } else {
                controller.setMyLabel1(player1 + " wonnnn!!!");
            }
            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }

        else if (!text00.isEmpty() && !text10.isEmpty() && !text20.isEmpty() &&
                !text01.isEmpty() && !text11.isEmpty() && !text21.isEmpty() &&
                !text02.isEmpty() && !text12.isEmpty() && !text22.isEmpty()) {
            controller.setMyLabel1("its a drawwww!!!");

            dialogStage.setScene(new Scene(dialogContent));
            dialogStage.showAndWait();
            resetBoardButton(event);
        }


    }


    @FXML
    public void resetBoardButton(ActionEvent event) {


        button00.setText("");
        button10.setText("");
        button20.setText("");
        button01.setText("");
        button11.setText("");
        button21.setText("");
        button02.setText("");
        button12.setText("");
        button22.setText("");
        nameLabel.setText(player1);

        // Re-enable buttons
        button00.setDisable(false);
        button10.setDisable(false);
        button20.setDisable(false);
        button01.setDisable(false);
        button11.setDisable(false);
        button21.setDisable(false);
        button02.setDisable(false);
        button12.setDisable(false);
        button22.setDisable(false);

    }
    private Scene preScene;
    private Stage stage;
    @FXML
    public void setPreScene(Scene scene) {
        this.preScene = scene;
    }
    @FXML
    public void resetPlayerButton(ActionEvent event) throws IOException {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(preScene);
        stage.show();

    }

}
