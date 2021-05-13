package manager.photo.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class BaseView {
    protected Pane rootViewPane;
    private FXMLLoader fxmlLoader;

    public BaseView() {
        String filename = getClass().getSimpleName();
        fxmlLoader = new FXMLLoader(getClass().getResource(filename + ".fxml"));
    }

    public Pane getRootViewPane() {
        return rootViewPane;
    }

    public FXMLLoader getFxmlLoader() {
        return fxmlLoader;
    }

    public void load() {
        try {
            rootViewPane = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
