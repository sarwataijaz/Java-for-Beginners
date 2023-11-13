package com.example.switchscenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String css = this.getClass().getResource("apply.css").toExternalForm();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(css);
        System.out.println(scene.getStylesheets());
        // include the scene you want to present first

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}