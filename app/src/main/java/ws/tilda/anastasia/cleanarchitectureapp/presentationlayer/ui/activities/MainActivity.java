package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import ws.tilda.anastasia.cleanarchitectureapp.R;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.ProjectPresenter;

public class MainActivity extends AppCompatActivity implements ProjectPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void displayProjectList(List<ProjectModel> projectModelList) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String error) {

    }
}
