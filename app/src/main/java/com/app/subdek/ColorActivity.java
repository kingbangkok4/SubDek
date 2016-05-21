package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 21-May-16.
 */
public class ColorActivity extends Activity {
    Button btnYellow, btnSkyBlue, btnOrange, btnBlue, btnRed, btnGreen, btnPink, btnBlack, btnPurple, btnWhite;
    Button btnSound, btnGroup, btnHome;
    Boolean sound = true;
    String group = "Color";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            sound = extras.getBoolean("sound");
        }

        btnHome = (Button) findViewById(R.id.btnHome);
        btnGroup = (Button) findViewById(R.id.btnGroup);
        btnSound = (Button) findViewById(R.id.btnSound);

        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnSkyBlue = (Button) findViewById(R.id.btnSkyBlue);
        btnOrange = (Button) findViewById(R.id.btnOrange);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnBlack = (Button) findViewById(R.id.btnBlack);
        btnPurple = (Button) findViewById(R.id.btnPurple);
        btnWhite = (Button) findViewById(R.id.btnWhite);

        CheckSound();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }
        });
        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainMenuActivity.class);
                startActivity(i);
            }
        });
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

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","yellow");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnSkyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","skyblue");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","orange");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","blue");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","red");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","green");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","pink");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","black");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","purple");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","white");
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
