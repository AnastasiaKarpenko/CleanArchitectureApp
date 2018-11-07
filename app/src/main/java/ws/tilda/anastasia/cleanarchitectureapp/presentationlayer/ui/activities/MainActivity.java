package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

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
        Toast.makeText(this, "Progress starts", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideProgress() {
        Toast.makeText(this, "Progress ends", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }
}
