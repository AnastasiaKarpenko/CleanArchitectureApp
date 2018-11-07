package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.impl;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.interactors.ProjectListingInteractorInterface;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.repositories.ProjectRepository;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.ProjectPresenter;

public class ProjectPresenterImpl implements ProjectPresenter, ProjectListingInteractorInterface.CallBack {

    ProjectPresenter.View mView;
    ProjectRepository mProjectRepository;

    ProjectPresenterImpl(View view, ProjectRepository projectRepository) {
        mView = view;
        mProjectRepository = projectRepository;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onProjectListingRetreived(List<ProjectModel> projectModelList) {

    }

    @Override
    public void onProjectListingRetreivalFailed(String error) {

    }
}
