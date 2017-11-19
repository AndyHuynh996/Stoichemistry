package com.example.tienh.stoichemistry;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MolarMass extends AppCompatActivity {
    private ImageView mImageView;
    private double molarmass;
    private EditText compound;
    private Tools tools;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molar_mass);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.periodic);

        tools = new Tools();
        Button molarBut = (Button) findViewById(R.id.molarButton);
        final LayoutInflater inflater = LayoutInflater.from(MolarMass.this);
        final TextView output = (TextView) findViewById(R.id.outputMolar);
    /*
        To create a bottomsheet that display the answer calculated
     */
        molarBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheet = new BottomSheetDialog(MolarMass.this);
                // View parentView = getLayoutInflater().inflate(R.layout.dialog,null);
                View layout = inflater.inflate(R.layout.dialog, null);
                TextView output = (TextView) layout.findViewById(R.id.Output);
                compound = (EditText) findViewById(R.id.editText);
                output.setText("The Molar Mass of "+ compound.getText().toString()+" is: " + tools.calculateMolarMass(compound) + " g/mole");

                bottomSheet.setContentView(layout);
                BottomSheetBehavior bottomBehavior = BottomSheetBehavior.from((View) layout.getParent());
                bottomBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics()));
                bottomSheet.show();

            }
        });
    }



}
