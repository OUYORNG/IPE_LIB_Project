import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    
    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
        Parent root = FXMLLoader.load(getClass().getResource("admin_dashboard.fxml"));
        arg0.setTitle("Hello");
        arg0.setScene(new Scene(root, 1315,890));
        arg0.show();
        
        
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
    public static void main(String[] args) {
        launch(args);
    }
}