package com.example.android.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Add a member variable to hold findRestaurantsButton to access it inside all the methods
    private Button mFindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the mFindRestaurantsButton variable
        // (Button) typecasts the view as Button
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);

        // Add a click listener
        // setOnclickListener() method takes a new OnClickListener as a parameter
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the activity with the intent
                startActivity(intent);
            }
        });
    }
}
