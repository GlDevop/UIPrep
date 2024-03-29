package gabriellee.project.uiprep;

//Model Object Hardcode Data.
public class Response {

    private int average;

    private int review;

    private int reputation;

    private int response;

    private int numReviews;

    private int numLeads;

    private int starScore;

    public Response(int average, int review, int reputation, int response, int numReviews, int numLeads, int starScore) {
        this.average = average;
        this.review = review;
        this.reputation = reputation;
        this.response = response;
        this.numReviews = numReviews;
        this.numLeads = numLeads;
        this.starScore = starScore;
    }

    public int getAverage() { return average; }

    public int getReview() {
        return review;
    }

    public int getReputation() {
        return reputation;
    }

    public int getResponse() {
        return response;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public int getNumLeads() {
        return numLeads;
    }

    public int getStarScore() {
        return starScore;
    }

}
