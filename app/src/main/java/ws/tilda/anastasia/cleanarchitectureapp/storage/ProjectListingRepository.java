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

        return projectModelList;
    }
}
