package com.example.tienh.stoichemistry;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MoleCalculation extends AppCompatActivity {

    private Tools tools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mole_calculation);

        Button moleButton = (Button) findViewById(R.id.calMole);
        final LayoutInflater inflater = LayoutInflater.from(MoleCalculation.this);
        final TextView output = (TextView) findViewById(R.id.outputMolar);
        double AvogradroNum = 6.023 * Math.pow(10, 23);

        tools = new Tools();

        moleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheet = new BottomSheetDialog(MoleCalculation.this);
                View layout = inflater.inflate(R.layout.dialog, null);
                TextView outPut = (TextView) layout.findViewById(R.id.Output);
                EditText compound = (EditText) findViewById(R.id.moleculeEdit);
                double compoundWeight = tools.calculateMolarMass(compound);
                EditText grams = (EditText) findViewById(R.id.compoundEdit);
                double compoundGram = Double.parseDouble(grams.getText().toString());
                double moles = compoundGram / compoundWeight;
                outPut.setText("Moles : " + moles + " M");

                bottomSheet.setContentView(layout);
                BottomSheetBehavior bottomBehavior = BottomSheetBehavior.from((View) layout.getParent());
                bottomBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics()));
                bottomSheet.show();


            }
        });


    }
}
