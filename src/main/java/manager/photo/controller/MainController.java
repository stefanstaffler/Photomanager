package manager.photo.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import manager.photo.view.BaseView;

public class MainController extends BaseController {
    @FXML
    private MenuItem closeMenuItem;

    public MainController(BaseView mainView) {
        super(mainView);
    }

    @FXML
    private void handleFileMenu(ActionEvent actionEvent) {
        MenuItem menuItem = (MenuItem) actionEvent.getTarget();

        if (menuItem.equals(closeMenuItem)) {
            Platform.exit();
        }
    }
}
