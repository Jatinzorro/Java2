package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        //Creating menu for main layout
        BorderPane layout=new BorderPane();
        HBox menu=new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        
        //creat buttons for menu
        Button firstBtn=new Button("Joke");
        Button secondBtn=new Button("Answer");
        Button thirdBtn=new Button("Explanation");
        
        //add buttons to menu
        menu.getChildren().addAll(firstBtn,secondBtn,thirdBtn);
        layout.setTop(menu);
        
        //Add subviews and add them to the menu buttons
        StackPane firstLayout=creatView("What do you call a bear with no teeth?");
        StackPane secondLayout=creatView("A gummy bear.");
        StackPane thirdLayout=creatView("Gummy bear is candy and candy is funny candy");
        
        firstBtn.setOnAction((event)->layout.setCenter(firstLayout));
        secondBtn.setOnAction((event)->layout.setCenter(secondLayout));
        thirdBtn.setOnAction((event)->layout.setCenter(thirdLayout));
        
        layout.setCenter(firstLayout);
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    private StackPane creatView(String text){
        StackPane layout=new StackPane();
        layout.setPrefSize(300,180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }
}
