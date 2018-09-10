package com.abc.dicegame;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button dicebtn;
    Button rollbtn;
    String arr[] = {"one", "two", "three", "four", "five", "six"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dicebtn = findViewById(R.id.dicebtn);
        rollbtn = findViewById(R.id.rollbtn);
        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("aaaa");
                Random random = new Random();
                Resources res = getResources();
                TypedArray img = res.obtainTypedArray(R.array.dice);
                Drawable drawable = img.getDrawable(random.nextInt(5));
                dicebtn.setBackground(drawable);
                dicebtn.setText("");
            }
        });


    }

    public void playMusic(String view) {


        int musicid = getResources().getIdentifier(view, "raw", "com.abc.dicegame");
        MediaPlayer md = MediaPlayer.create(this, musicid);
        md.start();
    }
}