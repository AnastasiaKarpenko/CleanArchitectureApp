package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui;

public interface BaseView {

    void showProgress();

    void hideProgress();

    void showError(String error);
}
