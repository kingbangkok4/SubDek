package com.app.subdek;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Arrays;

/**
 * Created by Administrator on 20-May-16.
 */
public class DisplayActivity extends Activity {
    //RelativeLayout layoutDisplay;
    Button btnNext, btnBack, btnSound, btnGroup;
    String imgBackground;
    Boolean sound;
    String strSound;
    String group;
    MediaPlayer mMedia;
    String[] groupArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //layoutDisplay = (RelativeLayout) findViewById(R.id.layoutDisplay);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnGroup = (Button) findViewById(R.id.btnGroup);
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
        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                CheckGroup();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Back();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Next();
            }
        });
        CheckSound();
        SetDisplay();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sound) {
                    PlaySound();
                }
            }
        }, 1000);


        switch (group) {
            case "Alphabet":
                groupArray = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                break;
            case "Day":
                groupArray = new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat"};
                break;
            case "Months":
                groupArray = new String[]{"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
                break;
            case "Number":
                groupArray = new String[]{"one", "two", "three", "four", "five", "six", "eight", "nine", "ten"};
                break;
            case "Color":
                groupArray = new String[]{"yellow", "skyblue", "orange", "red", "green", "pink", "black", "purple", "white"};
                break;
        }
    }

    private void PlaySound() {
        if (sound) {
            switch (imgBackground) {
                case "a":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.a);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ant);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ant_th);
                    mMedia.start();
                    break;
                case "b":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.b);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.bird);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.bird_th);
                    mMedia.start();
                    break;
                case "c":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.c);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.crab);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.crab_th);
                    mMedia.start();
                    break;
                case "d":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.d);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.dog);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.dog_th);
                    mMedia.start();
                    break;
                case "e":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.e);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.elephant);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.elephant_th);
                    mMedia.start();
                    break;
                case "f":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.f);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.fish);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.fish_th);
                    mMedia.start();
                    break;
                case "g":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.g);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.giraffe);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.giraffe_th);
                    mMedia.start();
                    break;
                case "h":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.h);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.hen);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.hen_th);
                    mMedia.start();
                    break;
                case "i":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.i);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.insect);
                    mMedia.start();
                    DelayTime(2000);
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.insect_th);
                    mMedia.start();
                    break;
                case "j":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.j);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.jellyfish);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.jellyfish_th);
                    mMedia.start();
                    break;
                case "k":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.k);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.kangaroo);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.kangaroo_th);
                    mMedia.start();
                    break;
                case "l":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.l);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.lion);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.lion_th);
                    mMedia.start();
                    break;
                case "m":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.m);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monkey);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monkey_th);
                    mMedia.start();
                    break;
                case "n":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.n);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nacre);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nacre_th);
                    mMedia.start();
                    break;
                case "o":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.o);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ox);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ox_th);
                    mMedia.start();
                    break;
                case "p":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.p);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.penguin);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.penguin_th);
                    mMedia.start();
                    break;
                case "q":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.q);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.queenbee);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.queenbee_th);
                    mMedia.start();
                    break;
                case "r":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.r);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.rabbit);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.rabbit_th);
                    mMedia.start();
                    break;
                case "s":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.s);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sheep_th);
                    mMedia.start();
                    break;
                case "t":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.t);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tiger);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tiger_th);
                    mMedia.start();
                    break;
                case "u":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.u);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.unicorn);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.unicorn_th);
                    mMedia.start();
                    break;
                case "v":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.v);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.vulture);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.vulture_th);
                    mMedia.start();
                    break;
                case "w":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.w);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.whale);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.whale_th);
                    mMedia.start();
                    break;
                case "x":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.x);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.xiphias);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.xiphias_th);
                    mMedia.start();
                    break;
                case "y":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.y);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yak);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yak_th);
                    mMedia.start();
                    break;
                case "z":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.z);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.zebra);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.zebra_th);
                    mMedia.start();
                    break;
                //----------------------Day----------------------------------
                case "sun":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sunday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.sunday_th);
                    mMedia.start();
                    break;
                case "mon":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.monday_th);
                    mMedia.start();
                    break;
                case "tue":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tuesday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.tuesday_th);
                    mMedia.start();
                    break;
                case "wed":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.wednesday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.wednesday_th);
                    mMedia.start();
                    break;
                case "thu":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.thursday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.thursday_th);
                    mMedia.start();
                    break;
                case "fri":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.friday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.friday_th);
                    mMedia.start();
                    break;
                case "sat":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.saturday);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.saturday_th);
                    mMedia.start();
                    break;
                //----------------------Months----------------------------------
                case "january":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.january);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.january_th);
                    mMedia.start();
                    break;
                case "february":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.february);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.february_th);
                    mMedia.start();
                    break;
                case "march":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.march);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.march_th);
                    mMedia.start();
                    break;
                case "april":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.april);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.april_th);
                    mMedia.start();
                    break;
                case "may":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.may);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.may_th);
                    mMedia.start();
                    break;
                case "june":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.june);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.june_th);
                    mMedia.start();
                    break;
                case "july":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.july);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.july_th);
                    mMedia.start();
                    break;
                case "august":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.august);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.august_th);
                    mMedia.start();
                    break;
                case "september":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.september);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.september_th);
                    mMedia.start();
                    break;
                case "october":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.october);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.october_th);
                    mMedia.start();
                    break;
                case "november":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.november);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.november_th);
                    mMedia.start();
                    break;
                case "december":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.december);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.december_th);
                    mMedia.start();
                    break;
                //------------------------- Number ------------------------------------
                case "one":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.one);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.one_th);
                    mMedia.start();
                    break;
                case "two":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.two);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.two_th);
                    mMedia.start();
                    break;
                case "three":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.three);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.three_th);
                    mMedia.start();
                    break;
                case "four":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.four);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.four_th);
                    mMedia.start();
                    break;
                case "five":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.five);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.five_th);
                    mMedia.start();
                    break;
                case "six":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.six);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.six_th);
                    mMedia.start();
                    break;
                case "seven":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.seven);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.seven_th);
                    mMedia.start();
                    break;
                case "eight":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.eight);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.eight_th);
                    mMedia.start();
                    break;
                case "nine":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nine);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.nine_th);
                    mMedia.start();
                    break;
                case "ten":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ten);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.ten_th);
                    mMedia.start();
                    break;
                //------------------------- Color -------------------------------------
                case "yellow":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yellow);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.yellow_th);
                    mMedia.start();
                    break;
                case "skyblue":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.skyblue);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.skyblue_th);
                    mMedia.start();
                    break;
                case "orange":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.orange);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.orange_th);
                    mMedia.start();
                    break;
                case "blue":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.blue);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.blue_th);
                    mMedia.start();
                    break;
                case "red":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.red);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.red_th);
                    mMedia.start();
                    break;
                case "green":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.green);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.green_th);
                    mMedia.start();
                    break;
                case "pink":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.pink);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.pink_th);
                    mMedia.start();
                    break;
                case "black":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.black);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.black_th);
                    mMedia.start();
                    break;
                case "purple":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.purple);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.purple_th);
                    mMedia.start();
                    break;
                case "white":
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.white);
                    mMedia.start();
                    DelayTime(2000);
                    stopPlaying();
                    mMedia = MediaPlayer.create(getBaseContext(), R.raw.white_th);
                    mMedia.start();
                    break;
            }
        }
    }

    private void SetDisplay() {
        RelativeLayout layoutDisplay = (RelativeLayout) findViewById(R.id.layoutDisplay);
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

    private void DelayTime(Integer times) {
        try {
            Thread.sleep(times);
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

    private  void Next(){
        int max = groupArray.length - 1;
        int index = Arrays.binarySearch(groupArray, imgBackground);
        if(index == max){
            index = 0;
        }else {
            index += 1;
        }
        imgBackground = groupArray[index];
        SetDisplay();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sound) {
                    stopPlaying();
                    PlaySound();
                }
            }
        }, 1000);
    }

    private  void Back(){
        int max = groupArray.length - 1;
        int index = Arrays.binarySearch(groupArray, imgBackground);
        if(index == 0){
            index = max;
        }else {
            index -= 1;
        }
        imgBackground = groupArray[index];
        SetDisplay();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sound) {
                    stopPlaying();
                    PlaySound();
                }
            }
        }, 1000);
    }

    private void stopPlaying() {
        if (mMedia != null) {
            super.onDestroy();
            mMedia.stop();
            mMedia.reset();
            mMedia.release();
            mMedia = null;
        }
    }

}
