package com.example.switchscenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("images.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setOnCloseRequest(event ->
        {
            event.consume(); // incase we dont press ok
            exit(stage);
        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void exit(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("You are about to exit!!");
        alert.setContentText("Are you sure you want to exit?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("Program is closed successfullyy!");
            stage.close();
        }
    }
}