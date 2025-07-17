package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Simple JavaFX demo application.
 */
public class DemoApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Greet");
        Label greeting = new Label();

        button.setOnAction(e -> {
            String name = textField.getText();
            greeting.setText("Hello, " + name + "!");
        });

        VBox root = new VBox(10, label, textField, button, greeting);
        root.setStyle("-fx-padding: 20;");
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Simple Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
