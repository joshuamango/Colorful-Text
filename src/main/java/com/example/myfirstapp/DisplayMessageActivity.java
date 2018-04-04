package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create an array of eight TextView objects
        TextView[] textViewArray = {
                findViewById(R.id.textView),
                findViewById(R.id.textView2),
                findViewById(R.id.textView3),
                findViewById(R.id.textView4),
                findViewById(R.id.textView5),
                findViewById(R.id.textView6),
                findViewById(R.id.textView7),
                findViewById(R.id.textView8)
        };

        // Add the same message to each textView object
        for (TextView textView : textViewArray) {
            textView.setText(message);
        }

        // Set a random text color for each TextView
        for (TextView textView : textViewArray) {
            textView.setTextColor(Color.rgb((int)(Math.random() * 255),
                    (int)(Math.random() * 255), (int)(Math.random() * 255 )));
        }
    }
}
