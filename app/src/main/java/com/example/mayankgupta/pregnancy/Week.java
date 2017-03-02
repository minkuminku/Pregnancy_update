package com.example.mayankgupta.pregnancy;

/**
 * Created by mayankgupta on 02/03/17.
 */

public class Week {

    private final String summary;
    private final int imageId;

    public Week(String summary, int imageId) {
        this.summary = summary;
        this.imageId = imageId;
    }

    public String getSummary() {
        return summary;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return "Week{" +
                "summary='" + summary + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
