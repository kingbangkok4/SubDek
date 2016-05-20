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

        if (mMedia != null) {
            mMedia.release();
        }

        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sound) {
                    PlaySound();
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                CheckGroup();
            }
        });
        CheckSound();
        SetDisplay();
    }

    private void PlaySound() {
        if (sound) {
            switch (imgBackground) {
                case "a":
                    stopPlaying();
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
                case "b":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.b);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.bird);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.bird_th);
                    mMedia.start();
                    break;
                case "c":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.c);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.crab);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.crab_th);
                    mMedia.start();
                    break;
                case "d":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.d);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.dog);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.dog_th);
                    mMedia.start();
                    break;
                case "e":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.e);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.elephant);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.elephant_th);
                    mMedia.start();
                    break;
                case "f":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.f);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.fish);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.fish_th);
                    mMedia.start();
                    break;
                case "g":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.g);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.giraffe);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.giraffe_th);
                    mMedia.start();
                    break;
                case "h":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.h);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.hen);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.hen_th);
                    mMedia.start();
                    break;
                case "i":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.i);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.insect);
                    mMedia.start();
                    DelayTime();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.insect_th);
                    mMedia.start();
                    break;
                case "j":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.j);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.jellyfish);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.jellyfish_th);
                    mMedia.start();
                    break;
                case "k":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.k);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.kangaroo);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.kangaroo_th);
                    mMedia.start();
                    break;
                case "l":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.l);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.lion);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.lion_th);
                    mMedia.start();
                    break;
                case "m":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.m);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monkey);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monkey_th);
                    mMedia.start();
                    break;
                case "n":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.n);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nacre);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nacre_th);
                    mMedia.start();
                    break;
                case "o":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.o);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ox);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ox_th);
                    mMedia.start();
                    break;
                case "p":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.p);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.penguin);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.penguin_th);
                    mMedia.start();
                    break;
                case "q":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.q);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.queenbee);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.queenbee_th);
                    mMedia.start();
                    break;
                case "r":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.r);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.rabbit);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.rabbit_th);
                    mMedia.start();
                    break;
                case "s":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.s);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sheep_th);
                    mMedia.start();
                    break;
                case "t":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.t);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tiger);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tiger_th);
                    mMedia.start();
                    break;
                case "u":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.u);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.unicorn);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.unicorn_th);
                    mMedia.start();
                    break;
                case "v":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.v);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.vulture);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.vulture_th);
                    mMedia.start();
                    break;
                case "w":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.w);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.whale);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.white_th);
                    mMedia.start();
                    break;
                case "x":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.x);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.xiphias);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.xiphias_th);
                    mMedia.start();
                    break;
                case "y":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.y);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yak);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yak_th);
                    mMedia.start();
                    break;
                case "z":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.z);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.zebra);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.zebra_th);
                    mMedia.start();
                    break;
                //----------------------Day----------------------------------
                case "sun":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sunday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sunday_th);
                    mMedia.start();
                    break;
                case "mon":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monday_th);
                    mMedia.start();
                    break;
                case "tue":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tuesday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tuesday_th);
                    mMedia.start();
                    break;
                case "wed":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.wednesday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.wednesday_th);
                    mMedia.start();
                    break;
                case "thu":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.thursday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.thursday_th);
                    mMedia.start();
                    break;
                case "fri":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.friday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.friday_th);
                    mMedia.start();
                    break;
                case "sat":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.saturday);
                    mMedia.start();
                    DelayTime();
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.saturday_th);
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
        if (sound) {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound));
        } else {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound_off));
        }
    }

    private void DelayTime() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void CheckGroup() {
        switch (group) {
            case "Alphabet":
                Intent i1 = new Intent(getBaseContext(), AlphabetActivity.class);
                i1.putExtra("sound", sound);
                startActivity(i1);
                break;
            case "Day":
                Intent i2 = new Intent(getBaseContext(), DayActivity.class);
                i2.putExtra("sound", sound);
                startActivity(i2);
                break;
            case "Months":
                Intent i3 = new Intent(getBaseContext(), MonthsActivity.class);
                i3.putExtra("sound", sound);
                startActivity(i3);
                break;
            case "Number":
                Intent i4 = new Intent(getBaseContext(), NumberActivity.class);
                i4.putExtra("sound", sound);
                startActivity(i4);
                break;
            case "Color":
                Intent i5 = new Intent(getBaseContext(), ColorActivity.class);
                i5.putExtra("sound", sound);
                startActivity(i5);
                break;
        }
    }

    private void stopPlaying() {
        if (mMedia != null) {
            mMedia.stop();
            mMedia.release();
            mMedia = null;
        }
    }

}
