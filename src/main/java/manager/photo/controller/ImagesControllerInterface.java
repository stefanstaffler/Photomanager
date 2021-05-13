package manager.photo.controller;

import javafx.scene.layout.Pane;
import manager.photo.data.image.Image;

import java.util.List;

public interface ImagesControllerInterface {
    Pane getViewPane();

    void loadImages(List<Image> imageList);
}
