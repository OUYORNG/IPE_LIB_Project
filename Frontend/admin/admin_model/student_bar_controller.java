import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Backend.Teacher.teacherinfo;

public class student_bar_controller {

    @FXML
    private ImageView profilepic;

    @FXML
    private Label specialize;

    @FXML
    private Label teacherid;

    @FXML
    private Label teachername;

    public void setData(){
        teacherinfo teacher = new teacherinfo();
        Image img = new Image(getClass().getResourceAsStream(teacher.getprofileURL()));
        profilepic.setImage(img);

        img = new Image(getClass().getResourceAsStream(post.get))
    }
}
