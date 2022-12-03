import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class exercise2 extends Application {
    TextField tf;
    Label out;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Multiplication Table");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 200, 250);

        myStage.setScene(myScene);

        Button bt = new Button("Enter");

        out = new Label();

        tf = new TextField();
        tf.setPromptText("Enter a Number");
        tf.setPrefColumnCount(5);

        tf.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                printToOut();
            }
        });

        bt.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {                
                printToOut();
            }
        });

        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(tf, bt, separator, out);

        myStage.show();
    }

    static String getTable(int n) {
        String out = "";
        for(int i=1; i<11; i++) 
            out += String.format("%d\tx\t%d\t=\t%d\n", n, i, n*i);
        return out;
    }

    void printToOut() {
        String inp = tf.getText();

        if(inp == "" || inp == null) 
            return;
        
        int n;
        try {
            n = Integer.parseInt(inp.strip());
            out.setText(getTable(n));
        }
        catch(Exception ob) {
            out.setText("Please Enter a Number only...");
        }
    }
}
