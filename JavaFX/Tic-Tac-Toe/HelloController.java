package com.example.tictactoe;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label welcome;
    @FXML
    private Label gameLabel;
    @FXML
    private GridPane gridLayout;
    @FXML
    private Button continueButton;
    @FXML
    private Button infoButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        gridLayout.setOpacity(0);
        DropShadow shadow = new DropShadow(60, Color.valueOf("#1b0c09"));
        welcome.setEffect(shadow);

        DropShadow shadow2 = new DropShadow(60, Color.valueOf("#1b0c09"));
        gameLabel.setEffect(shadow2);

        TranslateTransition transition1 = new TranslateTransition();
        TranslateTransition transition2 = new TranslateTransition();

        transition1.setNode(welcome);
        transition1.setDuration(Duration.millis(2000));
        transition1.setByY(-500);
        transition1.play();

        transition1.setOnFinished( event -> { // after the transition is finished
            transition2.setNode(gameLabel);
            transition2.setDuration(Duration.millis(2000));
            transition2.setByY(-480);
            transition2.play();
        } );

        FadeTransition fade = new FadeTransition();

        transition2.setOnFinished( event -> {


            fade.setNode(gridLayout);

            fade.setDuration(Duration.millis(1000));

            fade.setCycleCount(1);

            fade.setInterpolator(Interpolator.LINEAR);

            fade.setFromValue(0);

            fade.setToValue(1);

            fade.play();

        });

        fade.setOnFinished(event -> {
            // Make the gridLayout fully visible after the fade-in animation
            gridLayout.setOpacity(1);
            continueButton.setVisible(true);
            infoButton.setVisible(true);
        });

    }

    @FXML
    public void onInfoButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(null);
        alert.setContentText(null);
        alert.getDialogPane().getStylesheets().add(
                getClass().getResource("alertStyle.css").toExternalForm());

        alert.setHeaderText("Developed by: Sarwat Aijaz");
        alert.show();
    }

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void onContinueButton(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("player.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        String css = this.getClass().getResource("style.css").toExternalForm();

        Scene scene = new Scene(root,800,600);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }
}