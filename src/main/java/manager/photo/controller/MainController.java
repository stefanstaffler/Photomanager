package manager.photo.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Window;
import manager.photo.data.file.DirectoryControl;
import manager.photo.model.BaseModel;
import manager.photo.view.BaseView;

public class MainController extends BaseController {
    @FXML
    private MenuItem openMenuItem;
    @FXML
    private MenuItem closeMenuItem;

    public MainController(BaseView mainView, BaseModel mainModel) {
        super(mainView, mainModel);
    }

    @FXML
    private void handleFileMenu(ActionEvent actionEvent) {
        MenuItem menuItem = (MenuItem) actionEvent.getTarget();

        if (menuItem.equals(closeMenuItem)) {
            Platform.exit();
        } else if (menuItem.equals(openMenuItem)) {
            Pane rootViewPane = baseView.getRootViewPane();
            Window window = rootViewPane.getScene().getWindow();
            open(window);
        }
    }

    private void open(Window window) {
        DirectoryControl directoryControl = new DirectoryControl("Open image directory");
        directoryControl.openDirectoryChooser(window);
    }
}
