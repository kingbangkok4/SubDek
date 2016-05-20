package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 20-May-16.
 */
public class AlphabetActivity extends Activity {
    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
    Button btnSound,btnGroup,btnHome;
    Boolean sound = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            sound = extras.getBoolean("sound");
        }

        btnHome = (Button)findViewById(R.id.btnHome);
        btnGroup = (Button)findViewById(R.id.btnGroup);
        btnSound = (Button)findViewById(R.id.btnSound);

        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);
        btnC = (Button)findViewById(R.id.btnC);
        btnD = (Button)findViewById(R.id.btnD);
        btnE = (Button)findViewById(R.id.btnE);
        btnF = (Button)findViewById(R.id.btnF);
        btnG = (Button)findViewById(R.id.btnG);
        btnH = (Button)findViewById(R.id.btnH);
        btnI = (Button)findViewById(R.id.btnI);
        btnJ = (Button)findViewById(R.id.btnJ);
        btnK = (Button)findViewById(R.id.btnK);
        btnL = (Button)findViewById(R.id.btnL);
        btnM = (Button)findViewById(R.id.btnM);
        btnN = (Button)findViewById(R.id.btnN);
        btnO = (Button)findViewById(R.id.btnO);
        btnP = (Button)findViewById(R.id.btnP);
        btnQ = (Button)findViewById(R.id.btnQ);
        btnR = (Button)findViewById(R.id.btnR);
        btnS = (Button)findViewById(R.id.btnS);
        btnT = (Button)findViewById(R.id.btnT);
        btnU = (Button)findViewById(R.id.btnU);
        btnV = (Button)findViewById(R.id.btnV);
        btnW = (Button)findViewById(R.id.btnW);
        btnX = (Button)findViewById(R.id.btnX);
        btnY = (Button)findViewById(R.id.btnY);
        btnZ = (Button)findViewById(R.id.btnZ);

       CheckSound();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), MainActivity.class);
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

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group","Alphabet");
                i.putExtra("imgBackground","a");
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
