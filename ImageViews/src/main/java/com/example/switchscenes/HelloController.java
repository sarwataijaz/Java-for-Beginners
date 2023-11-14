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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    //ImageView is a Node for printing images loaded with 'Image'
    // Image = photo
    // ImageView = frame
    @FXML
    ImageView image2;
    @FXML
    ImageView image1;
    @FXML

  public void switchToImage2() {


        image2.setLayoutX(231);
        image2.setLayoutY(54);

        image1.setVisible(false);
        image2.setVisible(true);

        ImageView temp = image2;
        image2 = image1;
        image1 = temp;
    }


}