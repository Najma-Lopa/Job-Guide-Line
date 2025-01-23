package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Bjit {


    @FXML
    private Button visualBjit;

    @FXML
    void visualBjitOnAction(ActionEvent event) {

        try {
            FXMLLoader root=new FXMLLoader(Bjit.class.getResource("pieBjit.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)visualBjit.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

}
