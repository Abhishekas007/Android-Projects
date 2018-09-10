package com.spenterise.candil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {


    ImageView ivone,ivtwo;
    boolean isFadeOut = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivone=findViewById(R.id.ivone);
        ivtwo=findViewById(R.id.ivtwo);

        ivtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(!isFadeOut)
                    YoYo.with(Techniques.FadeOut).duration(100).playOn(ivtwo);
                    else
                        YoYo.with(Techniques.FadeIn).duration(100).playOn(ivtwo);
                    isFadeOut = !isFadeOut;



                }catch (Exception e){}
            }
        });


    }
}
