package com.example.jobguideline;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class queryFile {

    @FXML
    private RadioButton NodeJs;

    @FXML
    private Button backButton;

    @FXML
    private RadioButton cSharp;

    @FXML
    private RadioButton cobol;

    @FXML
    private RadioButton cpp;

    @FXML
    private RadioButton dart;

    @FXML
    private TextField enterCG;

    @FXML
    private TextField enterProject;

    @FXML
    private TextField enterRatingCF;

    @FXML
    private RadioButton flutter;

    @FXML
    private RadioButton html;

    @FXML
    private RadioButton iosSDK;

    @FXML
    private RadioButton java;

    @FXML
    private RadioButton javascript;

    @FXML
    private RadioButton ml;

    @FXML
    private RadioButton mysql;

    @FXML
    private RadioButton php;

    @FXML
    private RadioButton phython;

    @FXML
    private RadioButton react;

    @FXML
    private TextField solveCodechef;

    @FXML
    private TextField solveCodeforces;

    @FXML
    private TextField solveLeetcode;

    @FXML
    private TextField solveOthers;

    @FXML
    private Button submitButton;
    private Parent root;

    int javaa=0, cpp1=0, python1=0, javascript1=0, php1=0, csharp=0, ml1=0, nodejs1=0, flutter1=0, react1=0, cobol1=0, html1=0, mysql1=0, dart1=0, ios1=0;

    @FXML
    void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @FXML
    void cppOnAction(ActionEvent event) {

    }

    @FXML
    void javaOnAction(ActionEvent event) {

    }

    @FXML
    void pythonOnAction(ActionEvent event) {

    }

    @FXML
    void submitButtonOnAction(ActionEvent event) throws IOException {
        if(NodeJs.isSelected())
        {
            nodejs1=1;
        }
        if(cSharp.isSelected())
        {
            csharp=1;
        }
        if(react.isSelected())
        {
            react1=1;
        }
        if(phython.isSelected())
        {
            python1=1;
        }
        if(php.isSelected())
        {
            php1=1;
        }
        if(mysql.isSelected())
        {
            mysql1=1;
        }
        if( ml.isSelected())
        {
            ml1=1;
        }
        if(javascript.isSelected())
        {
            javascript1=1;
        }
        if(java.isSelected())
        {
            javaa=1;
        }
        if(iosSDK.isSelected())
        {
            ios1=1;
        }
        if(html.isSelected())
        {
            html1=1;
        }
        if(flutter.isSelected())
        {
            flutter1=1;
        }
        if(dart.isSelected())
        {
            dart1=1;
        }
        if(cpp.isSelected())
        {
            cpp1=1;
        }
        if(cobol.isSelected())
        {
            cobol1=1;
        }

        String cg1=enterCG.getText();
        String project1=enterProject.getText();
        String cfRatting1=enterRatingCF.getText();
        String codechef1=solveCodechef.getText();
        String cf1=solveCodeforces.getText();
        String leetcode1=solveLeetcode.getText();
        String other1=solveOthers.getText();
        double cg=Double.parseDouble(cg1);
        int project=Integer.parseInt(project1);
        int cfRatting=Integer.parseInt(cfRatting1);
        int codechef=Integer.parseInt(codechef1);
        int cf=Integer.parseInt(cf1);
        int leetcode=Integer.parseInt(leetcode1);
        int other=Integer.parseInt(other1);
        int totalRatting=codechef+cf+leetcode+other;
        int totalSkill=javaa+ cpp1+ python1+ javascript1+ php1+ csharp+ ml1+ nodejs1+ flutter1+ react1+ cobol1+ html1+ mysql1+ dart1+ ios1;

        if(cg>=3){
            if(cfRatting>=1200){
                if(totalSkill>=6){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("first.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
                else{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("second.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
            }
            else {
                if(totalSkill>=6){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("third.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
                else{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("forth.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
            }
        }
        else {
            if(cfRatting>=1200){
                if(totalSkill>=6){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("fifth.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
                else{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("sixth.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
            }
            else{
                if(totalSkill>=6){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("seventh.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
                else {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("eigth.fxml"));
                    root = loader.load();
                    // leadsoftpie instance = loader.getController();  // creating an instance by this we can access every method in finalPage;
                    // instance.show();
                    Scene scene = new Scene(root);
                    Stage stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene); // Place the scene in the stage
                    stage.show();
                }
            }
        }

    }

}
