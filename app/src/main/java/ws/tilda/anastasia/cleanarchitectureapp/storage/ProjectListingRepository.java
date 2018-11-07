package ws.tilda.anastasia.cleanarchitectureapp.storage;

import java.util.ArrayList;
import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.repositories.ProjectRepository;

public class ProjectListingRepository implements ProjectRepository {
    @Override
    public List<ProjectModel> getProjectListing() {
        List<ProjectModel> projectModelList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ProjectModel projectModel = new ProjectModel();
            projectModel.setTitle("Project " + i);
            projectModel.setDescription("Description for " + projectModel.getTitle());
            projectModelList.add(projectModel);
        }

        // Let's simulate some network/database lag

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return projectModelList;
    }

    private static void populateProjectListing(ProjectDatabase projectDatabase) {
        ProjectModel projectModel = new ProjectModel();
        projectModel.setTitle("Project 1");
        projectModel.setDescription("Desc");
        addProject(projectDatabase, projectModel);
    }

    private static void addProject(ProjectDatabase projectDatabase, ProjectModel projectModel) {
        projectDatabase.projectDAO().insertAll(projectModel);
    }


}
