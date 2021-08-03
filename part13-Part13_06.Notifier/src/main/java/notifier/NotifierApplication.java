package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox labelBar=new VBox();
        TextField top=new TextField("");
        Button btn=new Button("Update");
        Label thirdLabel=new Label();
        labelBar.getChildren().addAll(top,btn,thirdLabel);
        
        Scene view=new Scene(labelBar,200,100);
        btn.setOnAction((event)->{
            thirdLabel.setText(top.getText());
    });
        window.setScene(view);
        window.show();
        
        
    }

}
