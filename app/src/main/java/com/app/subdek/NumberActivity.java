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
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen,
            btnEleven, btnTwelvee, btnThirteen, btnFourteen, btnFifteen, btnSixteen, btnSeventeen, btnEighteen, btnNineteen, btnTwenty, btnThirty, btnFourty, btnFifty, btnSixty, btnSeventy, btnEighty, btnNinety, btnOnehundred;
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

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnTen = (Button) findViewById(R.id.btnTen);
        btnEleven = (Button) findViewById(R.id.btnEleven);
        btnTwelvee = (Button) findViewById(R.id.btnTwelvee);
        btnThirteen = (Button) findViewById(R.id.btnThirteen);
        btnFourteen = (Button) findViewById(R.id.btnFourteen);
        btnFifteen = (Button) findViewById(R.id.btnFifteen);
        btnSixteen = (Button) findViewById(R.id.btnSixteen);
        btnSeventeen = (Button) findViewById(R.id.btnSeventeen);
        btnEighteen = (Button) findViewById(R.id.btnEighteen);
        btnNineteen = (Button) findViewById(R.id.btnNineteen);
        btnTwenty = (Button) findViewById(R.id.btnTwenty);
        btnThirty = (Button) findViewById(R.id.btnThirty);
        btnFourty = (Button) findViewById(R.id.btnFourty);
        btnFifty = (Button) findViewById(R.id.btnFifty);
        btnSixty = (Button) findViewById(R.id.btnSixty);
        btnSeventy = (Button) findViewById(R.id.btnSeventy);
        btnEighty = (Button) findViewById(R.id.btnEighty);
        btnNinety = (Button) findViewById(R.id.btnNinety);
        btnOnehundred = (Button) findViewById(R.id.btnOnehundred);
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
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "one");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "two");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "three");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "four");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "five");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "six");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "seven");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "eight");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "nine");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "ten");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });

        btnEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "eleven");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnTwelvee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "twelvee");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "thirteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "fourteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "fifteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "sixteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSeventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "seventeen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnEighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "eighteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnNineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "nineteen");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "twenty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnThirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "thirty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFourty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "fourty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "fifty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSixty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "sixty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnSeventy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "seventy");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnEighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "eighty");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnNinety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "ninety");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
        btnOnehundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group", group);
                i.putExtra("imgBackground", "onehundred");
                i.putExtra("sound", sound);
                startActivity(i);
            }
        });
/*        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","eleven");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","twelvee");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","thirteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","fourteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","fifteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","sixteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","seventeen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","eighteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","nineteen");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","twenty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","thirty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","fourty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","fifty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","sixty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","seventy");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","eighty");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","ninety");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(getBaseContext(), DisplayActivity.class);
                i.putExtra("group",group);
                i.putExtra("imgBackground","onehundred");
                i.putExtra("sound",sound);
                startActivity(i);
            }
        });*/
    }

    private void CheckSound() {
        if (sound) {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound));
        } else {
            btnSound.setBackground(getResources().getDrawable(R.drawable.bt_sound_off));
        }
    }
}
