package manager.photo.controller;

import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import manager.photo.data.image.Image;
import manager.photo.view.BaseView;
import manager.photo.view.ListImagesColumnView;

import java.awt.image.BufferedImage;
import java.util.List;

public class ListImagesColumnController extends BorderPane implements ImagesControllerInterface {
    @FXML
    private VBox imageVBox;

    private BaseView baseView;

    public ListImagesColumnController() {
        baseView = new ListImagesColumnView();
        baseView.getFxmlLoader().setController(this);
        baseView.getFxmlLoader().setRoot(this);
        baseView.load();
    }

    @Override
    public void loadImages(List<Image> imageList) {
        imageVBox.getChildren().clear();

        for (Image image : imageList) {
            BufferedImage bufferedImage = image.getBufferedImage();
            javafx.scene.image.Image javafxImage = SwingFXUtils.toFXImage(bufferedImage, null);

            ImageView imageView = new ImageView(javafxImage);
            imageView.setPreserveRatio(true);
            imageView.fitWidthProperty().bind(imageVBox.prefWidthProperty());

            imageVBox.getChildren().add(imageView);
        }
    }

    @Override
    public Pane getViewPane() {
        return baseView.getRootViewPane();
    }
}
