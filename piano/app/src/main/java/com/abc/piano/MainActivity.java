package com.abc.piano;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   // int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,sound12;


    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button ten;
    Button eleven;
    Button twelve;
    String TAG = "MainActivity";
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//            AudioAttributes audioAttributes = new AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION).setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build();
//            soundPool =new SoundPool.Builder().setMaxStreams(12).setAudioAttributes(audioAttributes).build();
//
//
//
//        }else {
//            soundPool =new SoundPool(12, AudioManager.STREAM_MUSIC,0);
//        }
//        sound1=soundPool.load(this,R.raw.one,1);
//        sound2=soundPool.load(this,R.raw.two,1);
//        sound3=soundPool.load(this,R.raw.three,1);
//        sound4=soundPool.load(this,R.raw.four,1);
//        sound5=soundPool.load(this,R.raw.five,1);
//        sound6=soundPool.load(this,R.raw.six,1);
//        sound7=soundPool.load(this,R.raw.seven,1);
//        sound8=soundPool.load(this,R.raw.eight,1);
//        sound9=soundPool.load(this,R.raw.nine,1);
//        sound10=soundPool.load(this,R.raw.ten,1);
//        sound11=soundPool.load(this,R.raw.eleven,1);
//        sound12=soundPool.load(this,R.raw.twelve,1);
//
//
//
//    }
//    public void playSound(View v){
//        switch (v.getId()){
//
//            case R.id.one:
//                soundPool.play(sound1,1,1,0,0,1);
//                break;
//            case R.id.two:
//                soundPool.play(sound2,1,1,0,0,1);
//                break;
//            case R.id.three:
//                soundPool.play(sound3,1,1,0,0,1);
//                break;
//            case R.id.four:
//                soundPool.play(sound4,1,1,0,0,1);
//                break;
//            case R.id.five:
//                soundPool.play(sound5,1,1,0,0,1);
//                break;
//            case R.id.six:
//                soundPool.play(sound6,1,1,0,0,1);
//                break;
//            case R.id.seven:
//                soundPool.play(sound7,1,1,0,0,1);
//                break;
//            case R.id.eight:
//                soundPool.play(sound8,1,1,0,0,1);
//                break;
//            case R.id.nine:
//                soundPool.play(sound9,1,1,0,0,1);
//                break;
//            case R.id.ten:
//                soundPool.play(sound10,1,1,0,0,1);
//                break;
//            case R.id.eleven:
//                soundPool.play(sound11,1,1,0,0,1);
//                break;
//            case R.id.twelve:
//                soundPool.play(sound12,1,1,0,0,1);
//                break;
//
//        }
//
//
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        soundPool.release();
//        soundPool =null;
//    }
//}
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        ten=findViewById(R.id.ten);
        eleven=findViewById(R.id.eleven);
        twelve=findViewById(R.id.twelve);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);
            }
        });



    }
    public void playMusic(View view){
        int id=view.getId();
        String nameId=view.getResources().getResourceEntryName(id);
        int musicid=view.getResources().getIdentifier(nameId,"raw","com.abc.piano");
        MediaPlayer md=MediaPlayer.create(this,musicid);
        md.start();
    }
}
