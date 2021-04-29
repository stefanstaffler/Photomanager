package manager.photo.controller;

import manager.photo.model.BaseModel;
import manager.photo.view.BaseView;

public class BaseController {
    protected BaseView baseView;
    protected BaseModel baseModel;

    public BaseController(BaseView baseView, BaseModel baseModel) {
        this.baseView = baseView;
        this.baseModel = baseModel;

        baseView.getFxmlLoader().setController(this);
        baseView.load();
    }
}
