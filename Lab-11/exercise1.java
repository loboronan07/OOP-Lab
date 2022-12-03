import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;

public class exercise1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("This is the first JavaFX Application");

        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene(rootNode, 500, 200);

        myStage.setScene(myScene);

        Label myLabel = new Label();
        myLabel.setText("Welcome to JavaFX programming");
        myLabel.setTextFill(Color.MAGENTA);

        rootNode.getChildren().add(myLabel);

        myStage.show();
    }
}
