import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class student_bar_controller {

    @FXML
    private ImageView profileurl;

    @FXML
    private Label teacherid;

    @FXML
    private Label teachername;

    @FXML
    private Label teacherskill;

    public void setData(teacherinfo teacher){
        Image img = new Image(getClass().getResourceAsStream(teacher.getProfileURL()));
        profileurl.setImage(img);
        teacherid.setText(teacher.getTeacherid());
        teachername.setText(teacher.getTeachername());
    }

}
