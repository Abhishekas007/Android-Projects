package com.abc.sql;

import android.app.Dialog;
import android.content.Context;
import android.nfc.Tag;
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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    List<contact> list1;
    EditText ed1,ed2,ed3,ed4;
    Button b1;
    ImageView img;
    Context context;
    database df;

    String TAG ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=findViewById(R.id.rec);
        img=findViewById(R.id.img);
       df=new database(this);
      fetchdata();


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dailoge);

                b1=dialog.findViewById(R.id.b1);
                ed1=dialog.findViewById(R.id.ed1);
                ed2=dialog.findViewById(R.id.ed2);
                ed3=dialog.findViewById(R.id.ed3);
                ed4=dialog.findViewById(R.id.ed4);
                rec=dialog.findViewById(R.id.rec);
                img=dialog.findViewById(R.id.img);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        df.addContact(new contact(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString(),ed4.getText().toString()));
                        fetchdata();
                        dialog.dismiss();
                    }
                });
                dialog.show();


            }
        });





//        if(df.addContact(new contact("ab","1234","aaaa124124","drtg23"))){
//            Toast.makeText(this, "entered", Toast.LENGTH_SHORT).show();
//        }
//
 //        List<contact> ght=new ArrayList<>();
//
//        ght=df.getContact();
//        for (contact c:ght){
//            Toast.makeText(this, ""+c.getUname()+c.getUcontact(), Toast.LENGTH_SHORT).show();
//        }
//
//



    }



    public void fetchdata(){
        if(!df.getContact().isEmpty()){
            list1=df.getContact();

            rec = findViewById(R.id.rec);
            Rcadapter ad=new Rcadapter(MainActivity.this,list1);
            final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            rec.setLayoutManager(layoutManager);
            rec.setAdapter(ad);

        }
    }

    }

