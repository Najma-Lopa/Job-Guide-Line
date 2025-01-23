package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WorkSpace {


    @FXML
    private Button visualWorkSpace;

    @FXML
    void visualWorkSpaceOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(WorkSpace.class.getResource("pieWorkspace.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)visualWorkSpace.getScene().getWindow();
            stage.setTitle("TEMPERATURE CONVERTER");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

}
