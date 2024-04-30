import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class c implements Initializable {

    @FXML
    private VBox teacherlayout;
    private List<teacherinfo> recentlyAdded;

    
    private List<teacherinfo> recentlyAdded(){
        List<teacherinfo> list = new ArrayList<>();

        teacherinfo teacher = new teacherinfo();
        teacher.setProfileURL("./img/search.png");
        teacher.setTeachername("BOYLOY");
        teacher.setTeacherid("GIC_1245");
        teacher.setSkills("Web Developer");
        list.add(teacher);

        teacherinfo teacher1 = new teacherinfo();
        teacher1.setProfileURL("./img/search.png");
        teacher1.setTeachername("Bo");
        teacher1.setTeacherid("GIC_1245");
        teacher1.setSkills("Web Developer");
        list.add(teacher);

        return list;
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        recentlyAdded = new ArrayList<>(recentlyAdded());

        try {
            
            for(int i =0; i <recentlyAdded.size();  i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("admin_model/teacher_model.fxml"));

                    HBox cardBox = fxmlLoader.load();
                    student_bar_controller studentcontroller = fxmlLoader.getController();
                    studentcontroller.setData(recentlyAdded.get(i));
                    teacherlayout.getChildren().add(cardBox);

            }
        } catch (Exception e) {
            // TODO: handle exception7
        }
    }


}
