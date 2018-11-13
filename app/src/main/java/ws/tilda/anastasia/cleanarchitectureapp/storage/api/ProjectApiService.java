package ws.tilda.anastasia.cleanarchitectureapp.storage.api;


import io.reactivex.Observable;
import retrofit2.http.GET;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;

public interface ProjectApiService {

    //With RxJava
    @GET("/list")
    Observable<ProjectModel> getProjectList();
}
