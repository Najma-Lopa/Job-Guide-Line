package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Enosis {

    @FXML
    private Button visualEnosis;

    @FXML
    void visualEnosisOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(SouthTech.class.getResource("pieEnosis.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)visualEnosis.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
