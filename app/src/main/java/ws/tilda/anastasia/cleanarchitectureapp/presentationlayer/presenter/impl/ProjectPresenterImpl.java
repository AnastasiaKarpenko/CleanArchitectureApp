package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.impl;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.interactors.ProjectListingInteractorImpl;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.interactors.ProjectListingInteractorInterface;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.repositories.ProjectRepository;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.ProjectPresenter;

public class ProjectPresenterImpl implements ProjectPresenter, ProjectListingInteractorInterface.CallBack {

    ProjectPresenter.View mView;
    ProjectRepository mProjectRepository;

    public ProjectPresenterImpl(View view, ProjectRepository projectRepository) {
        mView = view;
        mProjectRepository = projectRepository;
    }

    @Override
    public void onResume() {
        mView.showProgress();
        new ProjectListingInteractorImpl(this, mProjectRepository);
    }

    @Override
    public void onError(String error) {
        mView.showError(error);
    }

    @Override
    public void onProjectListingRetreived(List<ProjectModel> projectModelList) {
        mView.hideProgress();
        mView.displayProjectList(projectModelList);
    }

    @Override
    public void onProjectListingRetreivalFailed(String error) {
        mView.hideProgress();
        mView.showError(error);
    }
}
