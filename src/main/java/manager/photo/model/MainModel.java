package manager.photo.model;

import manager.photo.dao.image.ImageDaoInterface;

public class MainModel extends BaseModel {
    private ImageDaoInterface imageDao;

    public MainModel(ImageDaoInterface imageDao) {
        super();

        this.imageDao = imageDao;
    }
}
