package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieChartController {

    @FXML
    private PieChart pieChart;
    @FXML
    private Button backFromSouthtech;


    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChart.getData().addAll(
                new Data("Solving skill", 40),
                new Data("Educational Background", 36.4),
                new Data("CP", 18.2),
                new Data("Team Work", 4.5),
                new Data("Communication", 4.5),
                new Data("Debugging", 4.5),
                new Data("Problem solving", 9.1),
                new Data("Software Development", 9.1),
                new Data("Certifications", 9.1)

        );

        // Call the method to update the labels with percentage
        updatePieChartLabelsWithPercentage(pieChart.getData());
    }

    // Method to update PieChart labels with percentage
    private void updatePieChartLabelsWithPercentage(List<Data> pieData) {
        double total = 0;
        for (Data data : pieData) {
            total += data.getPieValue();
        }

        for (Data data : pieData) {
            double percentage = (data.getPieValue() / total) * 100;
            data.setName(String.format("%s: %.1f%%", data.getName(), percentage));
        }
    }

    @FXML
    void backFromSouthtechOnAction(ActionEvent event) {
        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromSouthtech.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
