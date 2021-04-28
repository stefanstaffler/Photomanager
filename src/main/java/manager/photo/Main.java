package manager.photo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScene.fxml"));

        Pane rootPane = fxmlLoader.load();
        Scene scene = new Scene(rootPane, rootPane.getMinWidth(), rootPane.getMaxWidth());

        stage.setScene(scene);
        stage.setTitle("Photomanager");

        stage.show();
    }
}
