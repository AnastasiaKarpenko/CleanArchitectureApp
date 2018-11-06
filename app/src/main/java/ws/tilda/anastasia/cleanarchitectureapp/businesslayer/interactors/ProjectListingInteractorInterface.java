package ws.tilda.anastasia.cleanarchitectureapp.businesslayer.interactors;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;

public interface ProjectListingInteractorInterface {

    interface CallBack {

        void onProjectListingRetreived(List<ProjectModel> projectModelList);

        void onProjectListingRetreivalFailed(String error);
    }
}
