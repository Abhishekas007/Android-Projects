package com.abc.table;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    Button print;
    Button clear;
    TextView display;
    EditText enternumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        print=findViewById(R.id.button2);
        clear=findViewById(R.id.button);
        display=findViewById(R.id.display);
        enternumber=findViewById(R.id.enternumber);

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=enternumber.getText().toString();
                i=Integer.parseInt(s);
                for(int n=1;n<=10;n++){
                    display.append(i +"  *  "+n+"  =  "+(i*n)+"\n");
                    //display.append("" +n);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);
                enternumber.setText(null);
            }
        });




    }
}
