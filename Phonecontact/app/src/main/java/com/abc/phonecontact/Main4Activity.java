package com.abc.phonecontact;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main4Activity extends AppCompatActivity {

    Button butttt;
    EditText ed;
    EditText ed1;
    EditText ed2;
    TextView tv;

    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        butttt=findViewById(R.id.butttt);
        ed=findViewById(R.id.ed);
        ed2=findViewById(R.id.ed2);
        ed1=findViewById(R.id.ed1);
        tv=findViewById(R.id.tvt);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Contacts");


        butttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set("but");
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(butttt);
                String uidf=myRef.getKey();
                myRef.child(uidf).setValue(new mode(uidf,ed.getText().toString(),ed1.getText().toString(),ed2.getText().toString()));
                Toast.makeText(Main4Activity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });




    }
    public void set(String view){
        int a=getResources().getIdentifier(view,"raw","com.abc.phonecontact");
        MediaPlayer sd=MediaPlayer.create(this,a);
        sd.start();


    }
}
