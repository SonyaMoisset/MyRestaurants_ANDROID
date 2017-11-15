package com.example.android.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        // Pull out the data of the intent extra
        // getIntent() to recreate the Intent
        Intent intent = getIntent();

        // getStringExtra() pull out the location value
        String location = intent.getStringExtra("location");

        // setText() updates its text to contain the sentence and location
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
