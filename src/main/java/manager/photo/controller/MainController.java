package manager.photo.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Window;
import manager.photo.data.file.DirectoryControl;
import manager.photo.data.file.FileReader;
import manager.photo.data.image.Image;
import manager.photo.model.BaseModel;
import manager.photo.model.MainModel;
import manager.photo.view.BaseView;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class MainController extends BaseController {
    @FXML
    private MenuItem openMenuItem;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private ListView<ImageView> imageListView;

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
        File file = directoryControl.openDirectoryChooser(window);

        List<BufferedImage> bufferedImageList = FileReader.getBufferedImages(file);
        MainModel mainModel = (MainModel) baseModel;

        for (BufferedImage bufferedImage : bufferedImageList) {
            Image image = new Image();
            image.setBufferedImage(bufferedImage);
            mainModel.addImage(image);
        }
    }
}
