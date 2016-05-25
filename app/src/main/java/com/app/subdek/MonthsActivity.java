package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 21-May-16.
 */
public class MonthsActivity extends Activity {
    Button btnJanuary, btnFebruary, btnMarch, btnApril, btnMay, btnJune,
            btnJuly, btnAugust, btnSeptember, btnOctober, btnNovember, btnDecember;
    Button btnSound, btnGroup, btnHome;
    Boolean sound = true;
    String group = "Months";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            sound = extras.getBoolean("sound");
        }

        btnHome = (Button) findViewById(R.id.btnHome);
       // btnGroup = (Button) findViewById(R.id.btnGroup);
        btnSound = (Button) findViewById(R.id.btnSound);

        btnJanuary = (Button) findViewById(R.id.btnYellow);
        btnFebruary = (Button) findViewById(R.id.btnFebruary);
        btnMarch = (Button) findViewById(R.id.btnMarch);
        btnApril = (Button) findViewById(R.id.btnApril);
        btnMay = (Button) findViewById(R.id.btnMay);
        btnJune = (Button) findViewById(R.id.btnJune);
        btnJuly = (Button) findViewById(R.id.btnJuly);
        btnAugust = (Button) findViewById(R.id.btnAugust);
        btnSeptember = (Button) findViewById(R.id.btnSeptember);
        btnOctober = (Button) findViewById(R.id.btnOctober);
        btnNovember = (Button) findViewById(R.id.btnNovember);
        btnDecember = (Button) findViewById(R.id.btnDecember);

        CheckSound();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainMenuActivity.class);
                startActivity(i);
            }
        });
       /* btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainMenuActivity.class);
                startActivity(i);
            }
        });*/
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sound) {
                    sound = false;
                } else {
                    sound = true;
                }
                CheckSound();
            }
        });

        btnJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","january");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","february");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","march");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","april");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","may");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","june");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","july");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","august");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","september");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","october");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","november");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","december");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
    }

    private void CheckSound() {
        if (sound) {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound));
        } else {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound_off));
        }
    }
}
