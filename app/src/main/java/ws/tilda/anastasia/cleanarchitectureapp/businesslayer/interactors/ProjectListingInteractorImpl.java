package ws.tilda.anastasia.cleanarchitectureapp.businesslayer.interactors;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.repositories.ProjectRepository;

/**
 * Provides the data to the presentation layer
 */

public class ProjectListingInteractorImpl implements ProjectListingInteractorInterface {
    ProjectListingInteractorInterface.CallBack mCallBack;
    ProjectRepository mProjectRepository;


    public ProjectListingInteractorImpl(CallBack callback, ProjectRepository projectRepository) {
        mCallBack = callback;
        mProjectRepository = projectRepository;
        getData();
    }

    public void getData() {
        final List<ProjectModel> projectModelList = mProjectRepository.getProjectListing();

        if (projectModelList == null || projectModelList.size() == 0) {
            notifyError();
            return;
        } else {
            notifyDataUpdate(projectModelList);
        }
    }

    private void notifyDataUpdate(List<ProjectModel> projectModelList) {
        mCallBack.onProjectListingRetreived(projectModelList);
    }

    private void notifyError() {
        mCallBack.onProjectListingRetreivalFailed("Project list is empty");
    }


}
