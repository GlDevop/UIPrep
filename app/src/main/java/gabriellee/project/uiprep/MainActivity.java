package gabriellee.project.uiprep;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import gabriellee.project.uiprep.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ViewModel
        ViewModel viewmodel;
        viewmodel = ViewModelProviders.of(this).get(ViewModel.class);

        //Data Binding - UI Layout
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Setting Dynamic String Values
        Resources res = getResources();
        String sText = String.format(res.getString(R.string.score), viewmodel.getStarScore());
        String mText = String.format(res.getString(R.string.dynMessage), viewmodel.getNumLeads());
        String rText = String.format(res.getString(R.string.dynResponse), viewmodel.getNumReviews());

        //Binding Textviews
        binding.totalScore.setText(sText);
        binding.dynResponse.setText(rText);
        binding.dynMessage.setText(mText);

        //Binding Progressbars
        binding.averageBar.setProgress(viewmodel.getAverage());
        binding.reviewBar.setProgress(viewmodel.getReview());
        binding.repBar.setProgress(viewmodel.getReputation());
        binding.responseBar.setProgress(viewmodel.getResponse());

    }
}
