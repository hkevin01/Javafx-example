package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Intermediate JavaFX demo with layouts, menu bar, toolbars, and CSS styling.
 */
public class IntermediateDemoApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Menu Bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        menuBar.getMenus().addAll(fileMenu, editMenu);

        // Toolbar
        ToolBar toolBar = new ToolBar(new Button("New"), new Button("Open"), new Button("Save"));

        // Layouts
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(menuBar, toolBar);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Button submitButton = new Button("Submit");
        Label resultLabel = new Label();
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(submitButton, 1, 1);
        grid.add(resultLabel, 1, 2);

        submitButton.setOnAction(e -> {
            resultLabel.setText("Hello, " + nameField.getText() + "!");
        });

        vbox.getChildren().add(grid);
        vbox.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(vbox, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/src/style.css").toExternalForm());
        primaryStage.setTitle("JavaFX Intermediate Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
