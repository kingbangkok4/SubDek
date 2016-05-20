package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 20-May-16.
 */
public class DisplayActivity extends Activity {
    RelativeLayout layoutDisplay;
    Button btnBack, btnSound;
    String imgBackground;
    Boolean sound;
    String strSound;
    String group;
    MediaPlayer mMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        layoutDisplay = (RelativeLayout) findViewById(R.id.layoutDisplay);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnSound = (Button) findViewById(R.id.btnSound);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            group = extras.getString("group");
            imgBackground = extras.getString("imgBackground");
            sound = extras.getBoolean("sound");
        }

        if(mMedia != null){
            mMedia.release();
        }

        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sound){
                    PlaySound();
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckGroup();
            }
        });

            CheckSound();
            SetDisplay();


    }

    private void PlaySound() {
        if(sound){
            switch (imgBackground){
                case "a":
                   /* stopPlaying();*/
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.a);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ant);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ant_th);
                    mMedia.start();
                    break;
            }
        }
    }

    private void SetDisplay() {
        int resBackgroundId = getResources().getIdentifier(imgBackground, "drawable", getPackageName());
        layoutDisplay.setBackgroundResource(resBackgroundId);
    }

    private void CheckSound() {
        if(sound){
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound));
        }else {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound_off));
        }
    }

    private void DelayTime() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void CheckGroup() {
        switch (group) {
            case "Alphabet":
                Intent i1 = new  Intent(getBaseContext(), AlphabetActivity.class);
                i1.putExtra("sound",sound);
                startActivity(i1);
                break;
            case "Day":
                Intent i2 = new  Intent(getBaseContext(), DayActivity.class);
                i2.putExtra("sound", sound);
                startActivity(i2);
                break;
            case "Months":
                Intent i3 = new  Intent(getBaseContext(), MonthsActivity.class);
                i3.putExtra("sound",sound);
                startActivity(i3);
                break;
            case "Number":
                Intent i4 = new  Intent(getBaseContext(), NumberActivity.class);
                i4.putExtra("sound",sound);
                startActivity(i4);
                break;
            case "Color":
                Intent i5 = new  Intent(getBaseContext(), ColorActivity.class);
                i5.putExtra("sound",sound);
                startActivity(i5);
                break;
        }
    }

    private void stopPlaying(){
        if (mMedia != null) {
            mMedia.stop();
            mMedia.release();
            mMedia = null;
        }
    }

}
