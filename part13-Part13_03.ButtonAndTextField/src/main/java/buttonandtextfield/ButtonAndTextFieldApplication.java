package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn=new Button();
        
        TextField tf=new TextField();
        Pane pane=new Pane();
        
        pane.getChildren().add(btn);
        pane.getChildren().add(tf);
        
        btn.setLayoutX(100);
        btn.setLayoutY(100);
        tf.setLayoutX(250);
        tf.setLayoutY(250);
        Scene view =new Scene(pane,500,500);
        primaryStage.setScene(view);
        primaryStage.show();
         
    }

}
