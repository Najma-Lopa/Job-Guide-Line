package com.example.jobguideline;//package com.example.combinepjt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.List;

public class PieBdtask {

    @FXML
    private PieChart pieChartBdtask;

    @FXML
    private Button backFromBdtask;

    @FXML
    public void initialize() {
        // Add data to the PieChart
        pieChartBdtask.getData().addAll(
                new PieChart.Data("Solving skill", 20),
                new PieChart.Data("CGPA", 20),
                new PieChart.Data("Technical skill", 35),
                new PieChart.Data("Communication", 10),
                new PieChart.Data("Experience", 15)
        );
        updatePieChartLabelsWithPercentage(pieChartBdtask.getData());
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
    void backFromBdtaskOnAction(ActionEvent event) {

        try {
            FXMLLoader root=new FXMLLoader(list.class.getResource("list.fxml"));
            Scene scene=new Scene(root.load());
            Stage stage=(Stage)backFromBdtask.getScene().getWindow();
            stage.setTitle("MY JAVA FX");
            stage.setScene(scene);
            stage.show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
