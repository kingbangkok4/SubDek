package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 21-May-16.
 */
public class NumberActivity extends Activity {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    Button btnSound, btnGroup, btnHome;
    Boolean sound = true;
    String group = "Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            sound = extras.getBoolean("sound");
        }

        btnHome = (Button) findViewById(R.id.btnHome);
       // btnGroup = (Button) findViewById(R.id.btnGroup);
        btnSound = (Button) findViewById(R.id.btnSound);

        btnOne = (Button) findViewById(R.id.btnYellow);
        btnTwo = (Button) findViewById(R.id.btnSkyBlue);
        btnThree = (Button) findViewById(R.id.btnOrange);
        btnFour = (Button) findViewById(R.id.btnBlue);
        btnFive = (Button) findViewById(R.id.btnRed);
        btnSix = (Button) findViewById(R.id.btnGreen);
        btnSeven = (Button) findViewById(R.id.btnPink);
        btnEight = (Button) findViewById(R.id.btnBlack);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnTen = (Button) findViewById(R.id.btnTen);

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

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","one");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","two");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","three");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","four");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","five");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","six");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","seven");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","eight");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","nine");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","ten");
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
