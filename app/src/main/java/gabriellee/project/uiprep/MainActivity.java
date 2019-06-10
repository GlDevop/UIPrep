package gabriellee.project.uiprep;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ViewModel
        viewmodel = ViewModelProviders.of(this).get(ViewModel.class);

        //Find view by id
        TextView score = findViewById(R.id.totalScore);
        TextView response = findViewById(R.id.dynResponse);
        TextView message = findViewById(R.id.dynMessage);
        ProgressBar averageBar = findViewById(R.id.averageBar);
        ProgressBar reviewBar = findViewById(R.id.reviewBar);
        ProgressBar repBar = findViewById(R.id.repBar);
        ProgressBar respBar = findViewById(R.id.responseBar);

        //Setting TextViews
        score.setText(String.format("%d%%", viewmodel.getStarScore()));
        response.setText(String.format("%d reviews awaiting response", viewmodel.getNumReviews()));
        message.setText(String.format("%d new leads awaiting response", viewmodel.getNumLeads()));

        //Setting Progress bars
        averageBar.setProgress(viewmodel.getAverage());
        reviewBar.setProgress(viewmodel.getReview());
        repBar.setProgress(viewmodel.getReputation());
        respBar.setProgress(viewmodel.getResponse());

    }
}
