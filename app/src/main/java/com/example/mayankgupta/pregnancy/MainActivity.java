package com.example.mayankgupta.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView month_1 = (TextView) findViewById(R.id.month_1);
        month_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month1", new String[]{"Week 1","Week 2", "Week 3", "Week 4"});
                startActivity(weekIntent);
            }
        });


        TextView month_2 = (TextView) findViewById(R.id.month_2);
        month_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month2", new String[]{"Week 5","Week 6", "Week 7", "Week 8"});
                startActivity(weekIntent);
            }
        });

        TextView month_3 = (TextView) findViewById(R.id.month_3);
        month_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month3", new String[]{"Week 9","Week 10", "Week 11", "Week 12", "Week 13"});
                startActivity(weekIntent);
            }
        });

        TextView month_4 = (TextView) findViewById(R.id.month_4);
        month_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month4", new String[]{"Week 14","Week 15", "Week 16", "Week 17"});
                startActivity(weekIntent);
            }
        });

        TextView month_5 = (TextView) findViewById(R.id.month_5);
        month_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month5", new String[]{"Week 18","Week 19", "Week 20", "Week 21"});
                startActivity(weekIntent);
            }
        });

        TextView month_6 = (TextView) findViewById(R.id.month_6);
        month_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month6", new String[]{"Week 22","Week 23", "Week 24", "Week 25", "Week 26"});
                startActivity(weekIntent);
            }
        });

        TextView month_7 = (TextView) findViewById(R.id.month_7);
        month_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month7", new String[]{"Week 27","Week 28", "Week 29", "Week 30"});
                startActivity(weekIntent);
            }
        });

        TextView month_8 = (TextView) findViewById(R.id.month_8);
        month_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month8", new String[]{"Week 31","Week 32", "Week 33", "Week 34"});
                startActivity(weekIntent);
            }
        });

        TextView month_9 = (TextView) findViewById(R.id.month_9);
        month_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekIntent = new Intent(MainActivity.this, WeeksActivity.class);
                weekIntent.putExtra("month9", new String[]{"Week 35","Week 36", "Week 37", "Week 38", "Week 39"});
                startActivity(weekIntent);
            }
        });

    }
}
