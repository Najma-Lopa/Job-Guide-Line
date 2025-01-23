package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SouthTech {

    @FXML
    private Button visualSouthTech;

    @FXML
    void visualSouthTechOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(SouthTech.class.getResource("pieSouthTech.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)visualSouthTech.getScene().getWindow();
            stage.setTitle("TEMPERATURE CONVERTER");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

}
