package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class first {

    private Parent root;
    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("query.fxml"));
        root = loader.load();

        //queryFile instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        //instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void bjitOnAction(ActionEvent event) {

    }

    @FXML
    void brainstationOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("brainstation.fxml"));
        root = loader.load();
        brainstation instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void cefaloOnAction(ActionEvent event) {

    }

    @FXML
    void dreamOnAction(ActionEvent event) {

    }

    @FXML
    void enosisOnAction(ActionEvent event) {

    }

    @FXML
    void kazOnAction(ActionEvent event) {

    }

    @FXML
    void reveOnAction(ActionEvent event) {

    }

    @FXML
    void samsungOnAction(ActionEvent event) {

    }

    @FXML
    void southTechOnAction(ActionEvent event) {

    }

    @FXML
    void therapOnAction(ActionEvent event) {

    }

    @FXML
    void tigerOnAction(ActionEvent event) {

    }

    @FXML
    void vivasoftOnAction(ActionEvent event) {

    }

}
