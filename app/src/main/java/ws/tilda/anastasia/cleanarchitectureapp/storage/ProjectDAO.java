package ws.tilda.anastasia.cleanarchitectureapp.storage;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;

@Dao
public interface ProjectDAO {

    @Query("SELECT * FROM project")
    List<ProjectModel> getProjectList();

    @Query("SELECT * FROM project where title LIKE :projectTitle")
    ProjectModel getProject(String projectTitle);

    @Insert
    void insertAll(ProjectModel projectModel);

    @Delete
    void delete(ProjectModel projectModel);

}
