import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class exercise3 extends Application {
    TextField user;
    PasswordField pass;
    Label out;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Login Page");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 250, 200);

        myStage.setScene(myScene);

        Button bt = new Button("Sign in");

        Label welcome = new Label("Welcome");
        Label usrname = new Label("User Name: ");
        Label passwrd = new Label("Password");
        out = new Label();

        user = new TextField();
        user.setPromptText("Enter a Number");
        user.setPrefColumnCount(10);

        pass = new PasswordField();
        pass.setPromptText("Enter your Password");
        pass.setPrefColumnCount(10);

        user.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                authenticate();
            }
        });

        pass.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                authenticate();
            }
        });

        bt.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {                
                authenticate();
            }
        });

        Separator s1, s2;
        s1 = new Separator();
        s2 = new Separator();
        s1.setPrefWidth(250);
        s2.setPrefWidth(250);

        rootNode.getChildren().addAll(welcome, s1, usrname, user, passwrd, pass, s2, out, bt);

        myStage.show();
    }

    void authenticate() {
        String u = user.getText();
        String p = pass.getText();

        if(u == "" || u == null) {
            out.setText("Please Enter a Username");
            return;
        }

        if(p == "" || p == null) {
            out.setText("Please Enter a Password");
            return;
        }

        out.setText(String.format("Welcome %s", u));         
    }
}