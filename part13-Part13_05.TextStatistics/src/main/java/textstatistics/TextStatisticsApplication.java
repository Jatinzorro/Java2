package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch( TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea("this is a textField"));
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Label("Letters: 0"));
        buttons.getChildren().add(new Label("Words: 0"));
        buttons.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(buttons);

        

        Scene view = new Scene(layout,500,500);

        window.setScene(view);
        window.show();
    }

}
