package ws.tilda.anastasia.cleanarchitectureapp.businesslayer.repositories;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;

public interface ProjectRepository {

   List<ProjectModel> getProjectListing();
}
