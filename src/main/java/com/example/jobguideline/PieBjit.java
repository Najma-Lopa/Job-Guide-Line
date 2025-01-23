package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieBjit {



    @FXML
    private Button backFromBjit;

    @FXML
    private PieChart pieChartBjit;





    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChartBjit.getData().addAll(
                new PieChart.Data("Programming skill", 25),
                new PieChart.Data("Education background", 30),
                new PieChart.Data("Teamwork and collaboration ", 10),
                new PieChart.Data("Communication skills", 5),
                new PieChart.Data("Experience", 10),
                new PieChart.Data("problem solving", 20)

        );
        updatePieChartLabelsWithPercentage(pieChartBjit.getData());
    }

    // Method to update PieChart labels with percentage
    private void updatePieChartLabelsWithPercentage(List<PieChart.Data> pieData) {
        double total = 0;
        for (PieChart.Data data : pieData) {
            total += data.getPieValue();
        }

        for (PieChart.Data data : pieData) {
            double percentage = (data.getPieValue() / total) * 100;
            data.setName(String.format("%s: %.1f%%", data.getName(), percentage));
        }
    }
    @FXML
    void backFromBjitOnAction(ActionEvent event) {

        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromBjit.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
