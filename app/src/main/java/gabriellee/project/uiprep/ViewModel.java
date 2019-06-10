package gabriellee.project.uiprep;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class ViewModel extends AndroidViewModel {

    private Response response;

    //Creating response object
    public ViewModel(@NonNull Application application) {
        super(application);
        response = new Response(90,50, 40, 30, 5, 2, 50);
    }

    //Returning values from the response object
    public int getAverage() {
        return response.getAverage();
    }

    public int getReview() { return response.getReview(); }

    public int getReputation() {
        return response.getReputation();
    }

    public int getResponse() {
        return response.getResponse();
    }

    public int getNumReviews() {
        return response.getNumReviews();
    }

    public int getNumLeads() {
        return response.getNumLeads();
    }

    public int getStarScore() {
        return response.getStarScore();
    }

}
