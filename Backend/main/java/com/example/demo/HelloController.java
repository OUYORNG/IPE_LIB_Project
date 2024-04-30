package com.example.demo;

import com.example.demo.admin.*;
import com.example.demo.admin_model.teacher_lists_controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloController implements Initializable  {


    @FXML
    private VBox teacherlists;
    private List<teacherinfo> recentlyAdded;

    @Override
public void initialize(URL location, ResourceBundle resources) {
    recentlyAdded = new ArrayList<>(recentlyAdded());
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("teacher_lists"));
    try {
        for (int i = 0; i < recentlyAdded.size(); i++) {
            VBox vbox = fxmlLoader.load();
            teacher_lists_controller con = fxmlLoader.getController();
            con.setData(recentlyAdded.get(i));
            teacherlists.getChildren().add(vbox);
        }
    } catch (IOException e) {
        // Handle IO Exception
        e.printStackTrace();
    } catch (Exception e) {
        // Handle other exceptions
        e.printStackTrace();
    }
}



    
    // @Override
    // public void initialize(URL location, ResourceBundle resources) {
    //     recentlyAdded = new ArrayList<>(recentlyAdded());
    //     try {
    //         for (teacherinfo teacher : recentlyAdded) {
    //             FXMLLoader fxmlLoader = new FXMLLoader();
    //             fxmlLoader.setLocation(getClass().getResource("teacher_lists.fxml"));
    //             VBox vbox;
    //             try {
    //                 vbox = fxmlLoader.load();
    //             } catch (IOException e) {
    //                 // TODO Auto-generated catch block
    //                 e.printStackTrace();
    //             }
    //             teacher_lists_controller con = fxmlLoader.getController();
    //             con.setData(teacher);

    //             teacherlists.getChildren().add(vbox);
    //         }
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         System.out.println("error");
    //     }

    // }
    private List<teacherinfo> recentlyAdded(){
        List<teacherinfo> list = new ArrayList<>();
        teacherinfo teacher = new teacherinfo();
        teacher.setProfileURL("dashboard.png");
        teacher.setSkills("Web Dev");
        teacher.setTeacherid("Gic_12");
        teacher.setTeachername("Boy");
        list.add(teacher);
    
        teacherinfo teacher1 = new teacherinfo();
        teacher1.setProfileURL("dashboard.png");
        teacher1.setSkills("Web Dev");
        teacher1.setTeacherid("Gic_12");
        teacher1.setTeachername("Boy");
        list.add(teacher);
    
        return list;
    
    }
}
