package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadindActivity extends Activity{
    String group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            group = extras.getString("group");
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (group) {
                    case "Alphabet":
                        Intent i1 = new Intent(getBaseContext(), AlphabetActivity.class);
                        startActivity(i1);
                        finish();
                        break;
                    case "Day":
                        Intent i2 = new Intent(getBaseContext(), DayActivity.class);
                        startActivity(i2);
                        finish();
                        break;
                    case "Months":
                        Intent i3 = new Intent(getBaseContext(), MonthsActivity.class);
                        startActivity(i3);
                        finish();
                        break;
                    case "Number":
                        Intent i4 = new Intent(getBaseContext(), NumberActivity.class);
                        startActivity(i4);
                        finish();
                        break;
                    case "Color":
                        Intent i5 = new Intent(getBaseContext(), ColorActivity.class);
                        startActivity(i5);
                        finish();
                        break;
                }
            }
        }, 1000);
    }
}
