package com.blackdartq.listit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public EditText editText1;
    public EditText editText2;
    public EditText editText3;
    public EditText editText4;
    public EditText editText5;
    public EditText editText6;
    public EditText editText7;
    public EditText editText8;
    public EditText editText9;
    public EditText editText10;
    public EditText editText11;
    public EditText editText12;
    public EditText editText13;
    public EditText editText14;
    public EditText editText15;

    public EditText editTextDefault1;
    public EditText editTextDefault2;
    public EditText editTextDefault3;
    public EditText editTextDefault4;
    public EditText editTextDefault5;
    public EditText editTextDefault6;
    public EditText editTextDefault7;
    public EditText editTextDefault8;
    public EditText editTextDefault9;
    public EditText editTextDefault10;


    public LinearLayout scrollViewLayout;
    int counter=1;



    public void addEditText(){


        switch(counter){

            case 1:

                editText1 = new EditText(this);
                editText1.setMaxLines(1);
                //editText1.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText1);
                counter++;
                break;

            case 2:

                editText2 = new EditText(this);
                editText2.setMaxLines(1);
                //editText2.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText2);
                counter++;
                break;

            case 3:

                editText3 = new EditText(this);
                editText3.setMaxLines(1);
               // editText3.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText3);
                counter++;
                break;

            case 4:

                editText4 = new EditText(this);
                //editText4.setBackgroundColor(Color.parseColor("#ff1a1a"));
                editText4.setMaxLines(1);
                scrollViewLayout.addView(editText4);
                counter++;
                break;

            case 5:
                editText5 = new EditText(this);
                editText5.setMaxLines(1);
                //editText5.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText5);
                counter++;
                break;

            case 6:

                editText6 = new EditText(this);
                editText6.setMaxLines(1);
                //editText6.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText6);
                counter++;
                break;

            case 7:

                editText7 = new EditText(this);
                editText7.setMaxLines(1);
                //editText7.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText7);
                counter++;
                break;

            case 8:

                editText8 = new EditText(this);
                editText8.setMaxLines(1);
                //editText8.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText8);
                counter++;
                break;

            case 9:

                editText9 = new EditText(this);
                editText9.setMaxLines(1);
                //editText9.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText9);
                counter++;
                break;

            case 10:

                editText10 = new EditText(this);
                editText10.setMaxLines(1);
                //editText10.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText10);
                counter++;
                break;


            case 11:

                editText11 = new EditText(this);
                editText11.setMaxLines(1);
                //editText11.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText11);
                counter++;
                break;

            case 12:

                editText12 = new EditText(this);
                editText12.setMaxLines(1);
                //editText12.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText12);
                counter++;
                break;

            case 13:

                editText13 = new EditText(this);
                editText13.setMaxLines(1);
                //editText13.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText13);
                counter++;
                break;

            case 14:

                editText14 = new EditText(this);
                editText14.setMaxLines(1);
                //editText14.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText14);
                counter++;
                break;

            case 15:

                editText15 = new EditText(this);
                editText15.setMaxLines(1);
                //editText15.setBackgroundColor(Color.parseColor("#ff1a1a"));
                scrollViewLayout.addView(editText15);
                counter++;
                break;


        }




    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        scrollViewLayout = (LinearLayout)findViewById(R.id.scrollViewLayout);

        editTextDefault1 = new EditText(this);
        editTextDefault1.setMaxLines(1);

        editTextDefault2 = new EditText(this);
        editTextDefault2.setMaxLines(1);

        editTextDefault3 = new EditText(this);
        editTextDefault3.setMaxLines(1);

        editTextDefault4 = new EditText(this);
        editTextDefault4.setMaxLines(1);

        editTextDefault5 = new EditText(this);
        editTextDefault5.setMaxLines(1);

        editTextDefault6 = new EditText(this);
        editTextDefault6.setMaxLines(1);

        editTextDefault7 = new EditText(this);
        editTextDefault7.setMaxLines(1);

        editTextDefault8 = new EditText(this);
        editTextDefault8.setMaxLines(1);

        editTextDefault9 = new EditText(this);
        editTextDefault9.setMaxLines(1);

        editTextDefault10 = new EditText(this);
        editTextDefault10.setMaxLines(1);


        scrollViewLayout.addView(editTextDefault1);
        scrollViewLayout.addView(editTextDefault2);
        scrollViewLayout.addView(editTextDefault3);
        scrollViewLayout.addView(editTextDefault4);
        scrollViewLayout.addView(editTextDefault5);
        scrollViewLayout.addView(editTextDefault6);
        scrollViewLayout.addView(editTextDefault7);
        scrollViewLayout.addView(editTextDefault8);
        scrollViewLayout.addView(editTextDefault9);
        scrollViewLayout.addView(editTextDefault10);


        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                addEditText();


            }
        });



    }
}
