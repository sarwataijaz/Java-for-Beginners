package com.example.switchscenes;

import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {


    @FXML
    private Arc myArc;
    private Stage stage;

    private Scene scene;

    private Parent root;
    @FXML
    private Button myButton;
    @FXML
    private ProgressBar progressBar;
    @FXML

    public void Scene1(ActionEvent event) throws IOException {


                root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

    }

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("apply.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void leftButton() {
        myArc.setLayoutX(myArc.getLayoutX() - 10.0);
    }

    @FXML
    public void rightButton() {
        myArc.setLayoutX(myArc.getLayoutX() + 10.0);
    }

    @FXML
    public void upButton() {
        myArc.setLayoutY(myArc.getLayoutY() - 10.0);
    }

    @FXML
    public void downButton() {
        myArc.setLayoutY(myArc.getLayoutY() + 10.0);
    }
}