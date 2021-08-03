package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        //first view#########################
        BorderPane firstBorderPane=new BorderPane();
        firstBorderPane.setTop(new Label("First View"));
        Button firstBtn=new Button("To second view");
        firstBorderPane.setCenter(firstBtn);
        Scene firstScene=new Scene (firstBorderPane,300,300);
        
        //Second View#########################
        VBox secVBox=new VBox();
        Button secondBtn=new Button("To the third view");
        Label secondLabel=new Label("Second view");
        secVBox.getChildren().addAll(secondBtn,secondLabel);
        Scene secondScene=new Scene(secVBox,300,300);
        
        //Third View##########################
        GridPane gPane=new GridPane();
        Button thirdBtn=new Button("To the first view");
        Label thirdLabel=new Label("Third view");
        gPane.add(thirdLabel,0,0);
        gPane.add(thirdBtn,1,1);
        Scene thirdScene=new Scene(gPane,300,300);
        
        //Event Listner#####################
        firstBtn.setOnAction((event)->{
            window.setScene(secondScene);
        });
        
        secondBtn.setOnAction((event)->{
            window.setScene(thirdScene);
        });
        
        thirdBtn.setOnAction((event)->{
            window.setScene(firstScene);
        });
        
        window.setScene(firstScene);
        window.show();
        
        
        
    }

}
