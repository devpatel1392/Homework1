/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Bruce
 */
public class Homework1 extends Application {
    RadioButton rbFirst, rbSecond, rbThird, rb2First, rb2Second, rb2Third;
    CheckBox cbOne, cbTwo;
    Button btnSubmit, btnPrint;
    VBox vbOne, vbTwo, vbThree;
    ToggleGroup tg1, tg2;
    Label title;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        //Radio Buttons
        rbFirst = new RadioButton("Check 1 Radio 1");
        rbSecond = new RadioButton("Check 1 Radio 2");
        rbThird = new RadioButton("Check 1 Radio 2");
        rb2First = new RadioButton("Check 2 Radio 1");
        rb2Second = new RadioButton("Check 2 Radio 2");
        rb2Third = new RadioButton("Check 2 Radio 3");
        
        //Toggle Groups
        tg1 = new ToggleGroup();
        tg2 = new ToggleGroup();
        rbFirst.setToggleGroup(tg1);
        rbSecond.setToggleGroup(tg1);
        rbThird.setToggleGroup(tg1);
        rb2First.setToggleGroup(tg2);
        rb2Second.setToggleGroup(tg2);
        rb2Third.setToggleGroup(tg2);
        
        //CheckBoxes
        cbOne = new CheckBox("Check 1");
        cbTwo = new CheckBox("Check 2");
        
        //Buttons
        btnSubmit = new Button("Submit");
        btnSubmit.setOnAction(e-> handleButtonActionSubmit(e));
        btnPrint = new Button("Print");
        btnPrint.setOnAction(e-> handleButtonActionPrint(e));
        
        //VBoxes
        vbOne = new VBox(20, cbOne, rbFirst, rbSecond, rbThird);
        vbOne.setPadding(new Insets(10));
        vbTwo = new VBox(20, cbTwo, rb2First, rb2Second, rb2Third);
        vbTwo.setPadding(new Insets(10));
        vbThree = new VBox(20, btnSubmit, btnPrint);
        vbThree.setPadding(new Insets(10));
        
        title = new Label("HW1");
        
        GridPane root = new GridPane();
        root.addRow(0, title);
        GridPane.setColumnSpan(title, 3);
        GridPane.setHalignment(title, HPos.LEFT);
        root.addRow(1, vbOne, vbTwo, vbThree);
        
        Scene scene = new Scene(root, 500, 175);
        primaryStage.setTitle("Homework 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handleButtonActionSubmit(ActionEvent event) {
        String first, second, total;
        
        
        if (rbFirst.isSelected()) {
            first = "Check 1 Radio 1";
        } else if (rbSecond.isSelected()) {
            first = "Check 1 Radio 2";
        } else {
            first = "Check 1 Radio 3";
        }
        
        if (rb2First.isSelected()) {
            second = "Check 2 Radio 1";
        } else if (rb2Second.isSelected()) {
            second = "Check 2 Radio 2";
        } else {
            second = "Check 2 Radio 3";
        }
        total = first + "\n" + second;
    }
    
    public void handleButtonActionPrint(ActionEvent event) {
        String first, second, total;
        
        
        if (rbFirst.isSelected()) {
            first = "Check 1 Radio 1";
        } else if (rbSecond.isSelected()) {
            first = "Check 1 Radio 2";
        } else {
            first = "Check 1 Radio 3";
        }
        
        if (rb2First.isSelected()) {
            second = "Check 2 Radio 1";
        } else if (rb2Second.isSelected()) {
            second = "Check 2 Radio 2";
        } else {
            second = "Check 2 Radio 3";
        }
        
        total = first + "\n" + second;
        
        System.out.println(total);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
