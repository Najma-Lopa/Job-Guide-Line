package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class defoddil {

    @FXML
    private Label info;

    private Parent root;

    @FXML
    void previous(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
    @FXML
    void seepiechart(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("defoPie.fxml"));
        root = loader.load();
        defodilpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
        instance.show();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    void show(){
        info.setText("For an entry-level position at Daffodil Software Ltd., candidates typically need to meet several criteria:\n" + //"" + //
                        "1. Educational Background: A degree in Computer Science, or a related field is often required. Having additional certifications in relevant technologies like Java, Python, or web development tools is advantageous.\n" + //
                        "" + //
                        "2. Technical Skills: Proficiency in software development, web development, mobile apps development, and cloud services is essential. Knowledge in technologies like Odoo ERP, Salesforce, and custom software solutions is often beneficial.\n" + //
                        "" + //
                        "3. Soft Skills: Strong communication skills, problem-solving abilities, and the capacity to work in agile and innovative environments are critical.\n" + //
                        "" + //
                        "4. Learning Orientation: Daffodil emphasizes continuous learning and development, with a strong focus on keeping up with technological advancements.\n" + //
                        "" + //
                        "5. Adaptability: Since the company focuses on multiple sectors entry-level candidates must demonstrate adaptability to diverse project needs.");
    }
}
