package com.example.mayankgupta.pregnancy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WeekDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_detail);


        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString(Utility.WEEK_INTENT_KEY);
        Week week = Utility.weekSummary.get(inputString);
        TextView view = (TextView) findViewById(R.id.heading);
        ImageView imageView = (ImageView) findViewById(R.id.week_image);

        view.setText(week.getSummary());
        imageView.setImageResource(week.getImageId());
    }
}
