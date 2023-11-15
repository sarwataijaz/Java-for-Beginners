package com.example.javafxscenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(); // static method of Application class which calls start method
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load(); // works as a root note for creating place for basic components

        Scene scene = new Scene(root, Color.SKYBLUE); // works like JPanel, gives place for drawing, graphics

        Image icon = new Image("D:\\JavaFXScenes\\src\\peach bg.jpg");
        stage.getIcons().add(icon);


        stage.setTitle("Stage Program");

        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));

        stage.setScene(scene);
        stage.show(); // works like JFrame
    }


}