package com.example.randomnumbergenerator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HelloController implements Initializable {

    @FXML
    private ProgressBar myProgressBar;
    @FXML
    private Label myLabel;
    @FXML
    private Button button;
    private boolean stopThread = false;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

      //  myProgressBar.setStyle("-fx-accent: #00FF00;");

        Thread progressThread = new Thread(() -> {

                for (double i = 0.1; i <= 1 && stopThread != true; i += 0.1) {
                    final double temp = i;
                    try {
                        Thread.sleep(250);
                         // used to safely update the UI components from the background thread.
                        Platform.runLater(() -> {
                            if (myProgressBar != null) {
                                myProgressBar.setProgress(temp);
                            }

                                int num = (int) Math.round(temp * 100);
                                myLabel.setText(Integer.toString(num) + "%");

                            if (button != null && num == 100) {
                                button.setVisible(true);
                                stopThread = true;
                            }
                        });

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

        });

        progressThread.start();

    }


    @FXML
    public void switchToscene2(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("game.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        String css = this.getClass().getResource("apply.css").toExternalForm();

        scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    TextField lowerLimit;
    @FXML
    TextField upperLimit;
    @FXML
    Label result;
    @FXML
    public void generateRandom(ActionEvent event) {

        Random random = new Random();

        int lower = Integer.parseInt(lowerLimit.getText());
        int upper = Integer.parseInt(upperLimit.getText());

        if(lower > upper) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Invalid inputs");
            alert.setContentText("Lower limit must be less than upper limit!!");
            alert.show();
        }
        int ans = random.nextInt(lower, upper);

        result.setText(String.valueOf(ans));
    }
}