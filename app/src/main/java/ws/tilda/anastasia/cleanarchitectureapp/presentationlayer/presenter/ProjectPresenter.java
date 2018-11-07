package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.base.BasePresenter;

public interface ProjectPresenter extends BasePresenter {

    interface View {
        void displayProjectList(List<ProjectModel> projectModelList);
    }


}
