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
        imageList.add(image);
    }

    @Override
    public void removeImage(Image image) {
        imageList.remove(image);
    }

    @Override
    public List<Image> getAllImages() {
        return imageList;
    }
}
