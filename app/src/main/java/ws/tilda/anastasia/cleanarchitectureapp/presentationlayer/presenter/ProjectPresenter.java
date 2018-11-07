package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.base.BasePresenter;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.BaseView;

public interface ProjectPresenter extends BasePresenter {

    interface View extends BaseView {
        void displayProjectList(List<ProjectModel> projectModelList);
    }


}
