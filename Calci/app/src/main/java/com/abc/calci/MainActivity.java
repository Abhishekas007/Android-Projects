package com.abc.calci;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double first,second,result;
    boolean addition=false,
            substraction=false,
            multiplication=false,
            division=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nine=findViewById( R.id.nine);
        Button eight=findViewById( R.id.eight);
        Button seven=findViewById( R.id.seven);
        Button six=findViewById( R.id.six);
        Button five=findViewById( R.id.five);
        Button four=findViewById( R.id.four);
        Button three=findViewById( R.id.three);
        Button two=findViewById( R.id.two);
        Button one=findViewById( R.id.one);
        Button dot=findViewById( R.id.dot);
        Button zero=findViewById( R.id.zero);
        Button equal=findViewById( R.id.equal);
        Button del=findViewById( R.id.del);
        Button div=findViewById( R.id.div);
        Button mul=findViewById( R.id.mul);
        Button sub=findViewById( R.id.sub);
        Button add=findViewById( R.id.add);
        final TextView tv=findViewById(R.id.tv);
        tv.setText("");

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("9");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("8");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("7");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("6");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("5");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("4");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("3");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("2");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("1");

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append(".");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                tv.append("0");

            }
        });


        //operations

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");

                try {
                    second=Double.valueOf(tv.getText().toString());


                if (addition){
                    result=first+second;
                    tv.setText(""+result);
                }else if (substraction){
                    result=first-second;
                    tv.setText(""+result);

                }
                else if (multiplication){
                    result=first*second;
                    tv.setText(""+result);

                }
                else if (division){
                    result=first/second;
                    tv.setText(""+result);

                }}
                catch (Exception e){}

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                try {
                    String get=tv.getText().toString();
                    tv.setText(get.substring(0,get.length()-1));}
                    catch (Exception e){


                }



            }
        });
        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                playMusic("but");
                tv.setText(null);

                return true;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
              try {
                  first = Double.valueOf(tv.getText().toString());
                  tv.setText(null);
                  addition = true;
                  substraction = false;
                  multiplication = false;
                  division = false;
              }catch (Exception e){}

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = false;
                    substraction = false;
                    multiplication = true;
                    division = false;
                }
                catch (Exception e){}

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = false;
                    substraction = false;
                    multiplication = false;
                    division = true;
                }
                catch (Exception e){}

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("but");
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = false;
                    substraction = true;
                    multiplication = false;
                    division = false;
                }
                catch (Exception e){}

            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void playMusic(String view) {


        int musicid = getResources().getIdentifier(view, "raw", "com.abc.calci");
        MediaPlayer md = MediaPlayer.create(this, musicid);
        md.start();
    }

}
