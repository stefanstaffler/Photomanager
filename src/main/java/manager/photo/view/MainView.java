package manager.photo.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class MainView extends BaseView {
    public void showImages(Pane viewPane) {
        if (rootViewPane instanceof BorderPane) {
            ((BorderPane) rootViewPane).setCenter(viewPane);
        }
    }
}
