package com.abc.sql;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Rcadapter extends RecyclerView.Adapter<Rcadapter.Rcviewholder> {
    Context context;
    List<contact> list1;

    public Rcadapter(Context context,List<contact> list1) {

        this.context=context;
        this.list1=list1;


    }


    @NonNull
    @Override
    public Rcviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View v=inflater.inflate(R.layout.contact,viewGroup,false);
        Rcviewholder vh=new Rcviewholder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Rcviewholder rcviewholder, int i) {
        contact sd=list1.get(i);
        rcviewholder.t1.setText(sd.getUname());
        rcviewholder.t4.setText(sd.getUaddress());
        rcviewholder.t2.setText(sd.getUcontact());
        rcviewholder.t3.setText(sd.getUemail());


    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class Rcviewholder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4;

        public Rcviewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            t4=itemView.findViewById(R.id.t4);

        }
    }
}

