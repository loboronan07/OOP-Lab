import javax.lang.model.util.ElementScanner14;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class exercise4 extends Application {
    TextField a, b;
    Label output;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("GCD of Two Numbers");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 250, 140);
    
        myStage.setScene(myScene);
        
        Label prompt = new Label("Enter two numbers: ");
        
        Button btn = new Button("Get GCD");

        output = new Label();
    
        a = new TextField();
        b = new TextField();

        a.setPromptText("Enter a Number");
        b.setPromptText("Enter a Number");

        a.setPrefColumnCount(5);
        b.setPrefColumnCount(5);
        
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                printGCD();
            }
        });

        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                printGCD();
            }
        });
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                printGCD();
            }
        });
        
        Separator s1, s2;
        s1 = new Separator();
        s2 = new Separator();
        s1.setPrefWidth(250);
        s2.setPrefWidth(250);
        
        rootNode.getChildren().addAll(prompt, s1, a, b, btn, s2, output);
        
        myStage.show();
    }

    int getGCD(int m, int n) {
        while(m != n) 
            if(m > n) 
                m -= n;
            else 
                n -= m;
        
        return m;
    }

    void printGCD() {
        String s1 = a.getText(), s2 = b.getText();
        if(s1 == "" || s1 == null || s2 == "" || s2 == null) {
            output.setText("Please Enter values for both numbers...");
            return;
        }

        int n1, n2;

        try {
            n1 = Integer.parseInt(s1.strip());
            n2 = Integer.parseInt(s2.strip());

            output.setText(String.format("GCD of %d and %d is %d", n1, n2, getGCD(n1, n2)));
        }
        catch(Exception ob) {
            output.setText("Please Enter Numbers only...");
        }
    }
}
