package com.example.tienh.stoichemistry;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button molarBtn = (Button) findViewById(R.id.molarMass);

        molarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MolarMass.class));
            }
        });

        Button moleBtn = (Button) findViewById(R.id.moleButton);

        moleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MoleCalculation.class));
            }
        });

        Button elementInfoBut = (Button)findViewById(R.id.elementInfoMain);

        elementInfoBut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ElementInformations.class));
            }
        });
    }
}
