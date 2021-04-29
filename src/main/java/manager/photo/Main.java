package manager.photo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import manager.photo.controller.BaseController;
import manager.photo.controller.MainController;
import manager.photo.view.BaseView;
import manager.photo.view.MainView;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BaseView mainView = new MainView();
        BaseController mainController = new MainController(mainView);

        Pane rootViewPane = mainView.getRootViewPane();
        Scene scene = new Scene(rootViewPane, rootViewPane.getMinWidth(), rootViewPane.getMaxWidth());

        stage.setScene(scene);
        stage.setTitle("Photomanager");

        stage.show();
    }
}
