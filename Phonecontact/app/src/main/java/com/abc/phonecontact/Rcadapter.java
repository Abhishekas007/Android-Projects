package com.abc.phonecontact;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class Rcadapter extends RecyclerView.Adapter<Rcadapter.Rcviewholder> {

    Context context;
    List<String> stringList;
    String str;
    String[] strArray;
    //TextView ntv,numtv,etv;

    public Rcadapter(Context context, List<String> stringList){

        this.context= context;
        this.stringList=stringList;




    }

    @NonNull
    @Override
    public Rcviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
    View view =inflater.inflate(R.layout.contactdetail,viewGroup,false);

    Rcviewholder rcviewholder=new Rcviewholder(view);
    return rcviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Rcviewholder rcviewholder, int i) {

        str = stringList.get(i);
        strArray=str.split(":");


        if(strArray.length>0){
            Log.d("aaaaaaaa "+strArray[0],"+"+str);

            rcviewholder.name.setText(strArray[0]);
            rcviewholder.num.setText(strArray[1]);
            rcviewholder.ema.setText(strArray[2]);

//            rcviewholder.l1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Dialog dialog=new Dialog(context);
//                    dialog.setContentView(R.layout.dialoge);
//
//                    ntv=dialog.findViewById(R.id.ntv);
//                    ntv.setText(strArray[0]);
//                    numtv=dialog.findViewById(R.id.num);
//                    numtv.setText(strArray[1]);
//                    etv=dialog.findViewById(R.id.etv);
//                    etv.setText(strArray[2]);
//
//                }
//            });




        }



    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class Rcviewholder extends RecyclerView.ViewHolder{
        TextView name,ema,num;
        LinearLayout l1;


        public Rcviewholder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            ema=itemView.findViewById(R.id.ema);
            num=itemView.findViewById(R.id.num);
        }
    }
}
