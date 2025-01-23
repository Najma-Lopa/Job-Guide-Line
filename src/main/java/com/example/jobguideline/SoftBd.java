package com.example.jobguideline;//package com.example.combinepjt;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SoftBd {

    @FXML
    private Button visualSoftBd;

    @FXML
    void visualSoftBdOnAction(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("pieSoftBd.fxml"));;
            Scene scene = new Scene(root);
            Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene); // Place the scene in the stage
            stage.show(); // Display the stage
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
