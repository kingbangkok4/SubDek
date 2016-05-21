package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 21-May-16.
 */
public class DayActivity extends Activity{
    Button btnSun, btnMon, btnTue, btnWed, btnThu, btnFri, btnSat;
    Button btnSound,btnGroup,btnHome;
    Boolean sound = true;
    String group = "Day";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            sound = extras.getBoolean("sound");
        }

        btnSun = (Button)findViewById(R.id.btnYellow);
        btnMon = (Button)findViewById(R.id.btnOrange);
        btnTue = (Button)findViewById(R.id.btnRed);
        btnWed = (Button)findViewById(R.id.btnWed);
        btnThu = (Button)findViewById(R.id.btnSkyBlue);
        btnFri = (Button)findViewById(R.id.btnBlue);
        btnSat = (Button)findViewById(R.id.btnGreen);

        btnHome = (Button)findViewById(R.id.btnHome);
        btnGroup = (Button)findViewById(R.id.btnGroup);
        btnSound = (Button)findViewById(R.id.btnSound);

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
                Intent i = new  Intent(getBaseContext(), MainMenuActivity.class);
                startActivity(i);
            }
        });
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sound){
                    sound = false;
                }else {
                    sound = true;
                }
                CheckSound();
            }
        });

        btnSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","sun");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","mon");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","tue");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","wed");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","thu");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnFri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","fri");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","sat");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });

    }

    private void CheckSound() {
        if(sound){
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound));
        }else {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound_off));
        }
    }
}

