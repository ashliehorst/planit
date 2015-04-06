
package JSPDiscussion.reviews;

public class Review {
    private String username;
    private String reviewText;
    private String currentDateTime;

    public Review(String username, String reviewText, String currentDateTime) {
        this.username = username;
        this.reviewText = reviewText;
        this.currentDateTime = currentDateTime;
    }

    public Review(){
        username = "n/a";
        reviewText = "n/a";
        currentDateTime = "n/a";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }
    
    public String toFileString() {
            return username + "," + reviewText + "," + currentDateTime;
     }

 
     public void loadFromFileString(String str) {
            String[] parts = str.split(",");

            username = parts[0];
            reviewText = parts[1];
            currentDateTime = parts[2];
     }
    
}
