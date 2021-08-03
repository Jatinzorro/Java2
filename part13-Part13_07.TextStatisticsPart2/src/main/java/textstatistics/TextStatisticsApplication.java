package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane pane = new BorderPane();
        TextArea TArea = new TextArea();
        pane.setCenter(TArea);
        HBox labelBar = new HBox();
        labelBar.setSpacing(10);
        Label lattersLabel = new Label("letters: 0");
        Label wordsLabel = new Label ("words: 0");
        Label longestWordLabel = new Label("The longest word is: ");
        labelBar.getChildren().addAll(lattersLabel,wordsLabel,longestWordLabel);
        pane.setBottom(labelBar);
        Scene view=new Scene(pane,500,500);
        window.setScene(view);
        window.show();
        TArea.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longest = Arrays.stream(parts)
        .sorted((s1, s2) -> s2.length() - s1.length())
        .findFirst()
        .get();
    // set values of text elements
        lattersLabel.setText("Letters: "+String.valueOf(characters));
        wordsLabel.setText("Words: "+String.valueOf(words));
        longestWordLabel.setText("The longest word is: "+longest);
});
        
        
    }

}
