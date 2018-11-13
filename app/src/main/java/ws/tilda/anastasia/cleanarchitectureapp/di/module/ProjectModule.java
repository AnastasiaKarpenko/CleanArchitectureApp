package ws.tilda.anastasia.cleanarchitectureapp.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import ws.tilda.anastasia.cleanarchitectureapp.di.scope.PerActivity;
import ws.tilda.anastasia.cleanarchitectureapp.storage.api.ProjectApiService;

@Module
public class ProjectModule {

    public ProjectModule() {

    }

    @PerActivity
    @Provides
    ProjectApiService provideProjectApiService(Retrofit retrofit) {
        return retrofit.create(ProjectApiService.class);
    }
}
