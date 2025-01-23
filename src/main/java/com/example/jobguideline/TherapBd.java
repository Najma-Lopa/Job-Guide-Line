package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TherapBd {

    @FXML
    private Button visualTherap;

    @FXML
    void visualTherapOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(TherapBd.class.getResource("pieTherap.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)visualTherap.getScene().getWindow();
            stage.setTitle("TEMPERATURE CONVERTER");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
