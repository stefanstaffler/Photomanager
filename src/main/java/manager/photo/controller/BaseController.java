package manager.photo.controller;

import manager.photo.view.BaseView;

public class BaseController {
    private BaseView baseView;

    public BaseController(BaseView baseView) {
        this.baseView = baseView;

        baseView.getFxmlLoader().setController(this);
    }
}
