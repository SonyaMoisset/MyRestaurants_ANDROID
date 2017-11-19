package com.example.android.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);

        // Define the member variable at runtime in onCreate()
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
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
                Log.d(TAG, location);

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
