package com.abc.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img;
    Button play,p,s;
    MediaPlayer md;
    int pause;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
        play=findViewById(R.id.play);
        p=findViewById(R.id.p);
        s=findViewById(R.id.s);
        play.setOnClickListener(this);
        p.setOnClickListener(this);
        s.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                if (md==null) {
                    md = MediaPlayer.create(getApplicationContext(),R.raw.ar);
                md.start();}else if (!md.isPlaying()){
                    md.seekTo(pause);
                    md.start();
                }
                break;
            case R.id.p:
                if (md!=null){
                    md.pause();
                    pause=md.getCurrentPosition();
                }
                break;
            case R.id.s:
                if (md!=null){
                    md.stop();
                    md=null;
                }

                break;
        }
    }
}
