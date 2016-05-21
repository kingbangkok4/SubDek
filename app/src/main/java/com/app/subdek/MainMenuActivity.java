package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends Activity{
    Button btnAlphabet, btnDay, btnMonths, btnNumber, btnColor;
    Button btnAbount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnAlphabet = (Button)findViewById(R.id.btnAlphabet);
        btnDay = (Button)findViewById(R.id.btnDay);
        btnMonths = (Button)findViewById(R.id.btnMonths);
        btnNumber = (Button)findViewById(R.id.btnNumber);
        btnColor = (Button)findViewById(R.id.btnColor);

        btnAbount = (Button)findViewById(R.id.btnAbount);

        btnAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), LoadindActivity.class);
                i.putExtra("group","Alphabet");
                startActivity(i);
            }
        });
        btnDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), LoadindActivity.class);
                i.putExtra("group","Day");
                startActivity(i);
            }
        });
        btnMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), LoadindActivity.class);
                i.putExtra("group","Months");
                startActivity(i);
            }
        });
        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), LoadindActivity.class);
                i.putExtra("group","Number");
                startActivity(i);
            }
        });
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), LoadindActivity.class);
                i.putExtra("group","Color");
                startActivity(i);
            }
        });

        btnAbount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), AbountActivity.class);
                startActivity(i);
            }
        });

    }
}
