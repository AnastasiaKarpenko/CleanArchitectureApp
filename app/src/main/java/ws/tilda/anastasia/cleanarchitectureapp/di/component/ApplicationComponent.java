package ws.tilda.anastasia.cleanarchitectureapp.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import ws.tilda.anastasia.cleanarchitectureapp.di.module.NetworkModule;

@Singleton
@Component(modules = NetworkModule.class)
public interface ApplicationComponent {

    Retrofit exposeRetrofit();

    Context exposeContext();


}
