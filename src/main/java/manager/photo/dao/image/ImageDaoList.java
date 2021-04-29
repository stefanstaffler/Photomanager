package manager.photo.dao.image;

import manager.photo.data.image.Image;

import java.util.LinkedList;
import java.util.List;

public class ImageDaoList implements ImageDaoInterface {
    private List<Image> imageList;

    public ImageDaoList() {
        imageList = new LinkedList<>();
    }

    @Override
    public void addImage(Image image) {

    }

    @Override
    public void removeImage(Image image) {

    }

    @Override
    public List<Image> getAllImages() {
        return null;
    }
}
