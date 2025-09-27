/*
* запускається за допомогою maven:
* mvn clean compile
* mvn javafx:run
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WPFApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World!");
        Scene scene = new Scene(label, 300, 200);

        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}