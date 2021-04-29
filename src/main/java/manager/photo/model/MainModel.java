package manager.photo.model;

import manager.photo.dao.image.ImageDaoInterface;
import manager.photo.data.image.Image;

import java.util.List;

public class MainModel extends BaseModel {
    private ImageDaoInterface imageDao;

    public MainModel(ImageDaoInterface imageDao) {
        super();

        this.imageDao = imageDao;
    }

    public void addImage(Image image) {
        imageDao.addImage(image);
    }

    public void removeImage(Image image) {
        imageDao.removeImage(image);
    }

    public List<Image> getAllImages() {
        return imageDao.getAllImages();
    }
}
