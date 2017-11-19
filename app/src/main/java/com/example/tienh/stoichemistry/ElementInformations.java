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
import android.widget.ImageView;
import android.widget.TextView;

public class ElementInformations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_informations);


      ImageView  mImageView = (ImageView) findViewById(R.id.imageViewInfo);
        mImageView.setImageResource(R.drawable.periodic);

        final Tools tools = new Tools();
        Button elementInfoBut = (Button) findViewById(R.id.elementsinfoButton);
        final LayoutInflater inflater = LayoutInflater.from(ElementInformations.this);

        elementInfoBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheet = new BottomSheetDialog(ElementInformations.this);
                // View parentView = getLayoutInflater().inflate(R.layout.dialog,null);
                View layout = inflater.inflate(R.layout.dialog, null);
                TextView output = (TextView) layout.findViewById(R.id.Output);
                EditText elementEdit = (EditText) findViewById(R.id.elementinfoEdit);
                String elementStr = elementEdit.getText().toString();
                String element = tools.Elt(elementStr);
                String elementStats = ElementsStat.lookup(element);

                String info = elementStats;
                if(elementStats == null){
                    output.setText("*The Element \""+ elementStr +"\" You Are Searching For Does Not Exist*" +
                            "\n*Please Make Sure The First Character Of The Element is CAPITALIZED*");
                }else {
                    output.setText("Element Information: \n" + elementStr + "\n" + info);
                }
                bottomSheet.setContentView(layout);
                BottomSheetBehavior bottomBehavior = BottomSheetBehavior.from((View) layout.getParent());
                bottomBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics()));
                bottomSheet.show();

            }
        });




    }
}
