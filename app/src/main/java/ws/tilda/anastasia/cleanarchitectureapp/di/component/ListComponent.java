package ws.tilda.anastasia.cleanarchitectureapp.di.component;

import dagger.Component;
import ws.tilda.anastasia.cleanarchitectureapp.di.module.ProjectModule;
import ws.tilda.anastasia.cleanarchitectureapp.di.scope.PerActivity;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.activities.MainActivity;

@PerActivity
@Component(modules = ProjectModule.class, dependencies = ApplicationComponent.class)
public interface ListComponent {
    void inject(MainActivity activity);
}
