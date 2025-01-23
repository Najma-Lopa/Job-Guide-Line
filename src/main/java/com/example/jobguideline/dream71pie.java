package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class dream71pie {

    @FXML
    private PieChart pie; 
    private Parent root;

    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void show() {
        // Clear any existing data from the PieChart
        pie.getData().clear();

        // Creating the data
        PieChart.Data slice2 = new PieChart.Data("Technical Skills", 20);
        PieChart.Data slice1 = new PieChart.Data("Educational Background", 25);
        PieChart.Data slice3 = new PieChart.Data("Database Experience", 15);
        PieChart.Data slice4 = new PieChart.Data("Problem-Solving Abilities", 15);
        PieChart.Data slice5 = new PieChart.Data("Communication Skills", 10);
        PieChart.Data slice6 = new PieChart.Data("Problem-Solving Abilities", 15);

        pie.getData().addAll(slice1, slice2, slice3, slice4, slice5,slice6);

        // Calculate total value
        double total = 20 + 25 + 15 + 15 + 10+15;

        // Set data with percentage labels
        for (PieChart.Data data : pie.getData()) {
            double percentage = (data.getPieValue() / total) * 100;
            data.setName(data.getName() + " " + String.format("%.1f%%", percentage));
        }

        // Setting the title of the PieChart
        pie.setTitle("Entry-Level Job Criteria at Dream 71 Bangladesh");
    }
}
