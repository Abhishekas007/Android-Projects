package com.abc.phonecontact;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ImageView img;
    RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.img);
        rec = findViewById(R.id.rec);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Contacts");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<mode> modelist = new ArrayList<mode>();
                modelist.clear();
                for (DataSnapshot md : dataSnapshot.getChildren()) {
                    modelist.add(md.getValue(mode.class));
                }

                List<String> strList = new ArrayList<>();
                for (mode a : modelist) {
                    strList.add(a.getName() + ":" + a.getNumber() + ":" + a.getEmail());
                }
                Log.d("newdata", "=" + strList.toString());

                Rcadapter rcadapter = new Rcadapter(Main2Activity.this, strList);
                rec.setLayoutManager(new LinearLayoutManager(Main2Activity.this));
                rec.setAdapter(rcadapter);

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(1000).playOn(img);
                set("but");

                startActivity(new Intent(Main2Activity.this, Main4Activity.class));

            }
        });


    }

    public void set(String view) {
        int a = getResources().getIdentifier(view, "raw", "com.abc.phonecontact");
        MediaPlayer sd = MediaPlayer.create(this, a);
        sd.start();
    }
}
