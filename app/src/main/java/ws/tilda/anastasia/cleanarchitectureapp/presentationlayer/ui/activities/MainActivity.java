package ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ws.tilda.anastasia.cleanarchitectureapp.R;
import ws.tilda.anastasia.cleanarchitectureapp.businesslayer.models.ProjectModel;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.ProjectPresenter;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.presenter.impl.ProjectPresenterImpl;
import ws.tilda.anastasia.cleanarchitectureapp.presentationlayer.ui.adapters.ProjectAdapter;
import ws.tilda.anastasia.cleanarchitectureapp.storage.ProjectListingRepository;

public class MainActivity extends AppCompatActivity implements ProjectPresenter.View {
    @BindView(R.id.project_list)
    ListView mProjectList;
    ProjectAdapter mProjectAdapter;
    private ProjectPresenter mProjectPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mProjectAdapter = new ProjectAdapter(this);
        mProjectList.setAdapter(mProjectAdapter);

        mProjectPresenter = new ProjectPresenterImpl(this, new ProjectListingRepository());
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
