package com.example.suelentask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Created by: Suelen Vicente
//Student ID: 8752253
//Conestoga College - Mobile Solutions Development Co-op
//PROG8480 - Mobile Application Development - Android

public class MainActivity extends AppCompatActivity {

    // Creating widget references
    Button btnCard1;
    Button btnCard2;
    Button btnCard3;
    Button btnCard4;
    Button btnCard5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiating widget references
        btnCard1 = (Button)findViewById(R.id.btnLearnMoreCard1);
        btnCard2 = (Button)findViewById(R.id.btnLearnMoreCard2);
        btnCard3 = (Button)findViewById(R.id.btnLearnMoreCard3);
        btnCard4 = (Button)findViewById(R.id.btnLearnMoreCard4);
        btnCard5 = (Button)findViewById(R.id.btnLearnMoreCard5);

        //Learn More button on Card 1 will display that
        // Math course length is 3 years and its fees is $12000 per year
        btnCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Defining length and fee for Math course
                String length = "3 years";
                String fee = "$12000 / year";

                //Using toast to display a short length message
                // with the length and the fees of Math course
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This course lasts " + length + " and costs " + fee, Toast.LENGTH_SHORT);

                //Command to center the toast message
                toast.setGravity(Gravity.CENTER, 0, 0);

                //Show toast message in the screen
                toast.show();
            }
        });

        //Learn More button on Card 2 will display that
        // Physics course length is 5 years and its fees is $18000 per year
        btnCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Defining length and fee for Physics course
                String length = "5 years";
                String fee = "$18000 / year";

                //Using toast to display a short length message
                // with the length and the fees of Physics course
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This course lasts " + length + " and costs " + fee, Toast.LENGTH_SHORT);

                //Command to center the toast message
                toast.setGravity(Gravity.CENTER, 0, 0);

                //Show toast message in the screen
                toast.show();
            }
        });

        //Learn More button on Card 3 will display that
        // Chemistry course length is 4 years and its fees is $15600 per year
        btnCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Defining length and fee for Chemistry course
                String length = "4 years";
                String fee = "$15600 / year";

                //Using toast to display a short length message
                // with the length and the fees of Chemistry course
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This course lasts " + length + " and costs " + fee, Toast.LENGTH_SHORT);

                //Command to center the toast message
                toast.setGravity(Gravity.CENTER, 0, 0);

                //Show toast message in the screen
                toast.show();
            }
        });

        //Learn More button on Card 4 will display that
        // Biology course length is 2 years and its fees is $13700 per year
        btnCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Defining length and fee for Biology course
                String length = "2 years";
                String fee = "$13700 / year";

                //Using toast to display a short length message
                // with the length and the fees of Biology course
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This course lasts " + length + " and costs " + fee, Toast.LENGTH_SHORT);

                //Command to center the toast message
                toast.setGravity(Gravity.CENTER, 0, 0);

                //Show toast message in the screen
                toast.show();
            }
        });

        //Learn More button on Card 5 will display that
        // Geography course length is 3 years and its fees is $11800 per year
        btnCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Defining length and fee for Geography course
                String length = "3 years";
                String fee = "$11800 / year";

                //Using toast to display a short length message
                // with the length and the fees of Geography course
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This course lasts " + length + " and costs " + fee, Toast.LENGTH_SHORT);

                //Command to center the toast message
                toast.setGravity(Gravity.CENTER, 0, 0);

                //Show toast message in the screen
                toast.show();
            }
        });
    }
}