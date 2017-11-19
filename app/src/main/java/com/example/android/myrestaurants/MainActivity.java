package com.example.android.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @Bind(R.id.locationEditText) EditText mLocationEditText;
    @Bind(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Define our new font as Typeface type and call createFromAsset() to reference the .ttf font file
        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        // Call setTypeface() on the TextView
        mAppNameTextView.setTypeface(ostrichFont);

        // Add a click listener
        // setOnclickListener() takes a new OnClickListener as a parameter
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Save into a String variable the inputted value
                // getText() returns an editable data type
                // toString(0 converts it
                String location = mLocationEditText.getText().toString();

                // Create a new intent
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Attach data to the Intent as key value pair
                intent.putExtra("location", location);

                // Start the activity with the intent
                startActivity(intent);
            }
        });
    }
}
