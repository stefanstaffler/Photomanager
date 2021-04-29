package manager.photo.dao.image;

import manager.photo.data.image.Image;

import java.util.List;

public interface ImageDaoInterface {
    void addImage(Image image);

    void removeImage(Image image);

    List<Image> getAllImages();
}
