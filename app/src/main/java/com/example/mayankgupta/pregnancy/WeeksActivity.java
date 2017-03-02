package com.example.mayankgupta.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class WeeksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeks);

        Bundle extras = getIntent().getExtras();

        String key = extras.keySet().iterator().next();

        String[] month = extras.getStringArray(key);

        // Find a reference to the {@link ListView} in the layout
        ListView weekListView = (ListView) findViewById(R.id.activity_weeks);

        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, month);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        weekListView.setAdapter(adapter);

        weekListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView weeksView = (TextView) view;
                final String weekName = weeksView.getText().toString();

                Intent weekDetailActivity = new Intent(WeeksActivity.this, WeekDetailActivity.class);
                weekDetailActivity.putExtra(Utility.WEEK_INTENT_KEY, weekName);
                startActivity(weekDetailActivity);
            }
        });


    }
}
