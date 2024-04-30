package com.example.demo.admin_model;
import com.example.demo.admin.teacherinfo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class teacher_lists_controller {

    @FXML
    private ImageView profileurl;

    @FXML
    private Label skills;

    @FXML
    private Label teacherid;

    @FXML
    private Label teachername;

    public void setData(teacherinfo teacher){
        Image img = new Image(getClass().getResourceAsStream(teacher.getProfileURL()));
        profileurl.setImage(img);
        skills.setText(teacher.getSkills());
        teacherid.setText(teacher.getTeacherid());
        teachername.setText(teacher.getTeachername());
    }

}
