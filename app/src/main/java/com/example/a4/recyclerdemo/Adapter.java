package com.example.a4.recyclerdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by A4 on 11/25/2017.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    String[] name;

    Adapter(Context context,String[] s)
    {
        Log.i("ABC",s.toString());
        this.context=context;
        name=s;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View row=inflater.inflate(R.layout.row_act,parent,false);
        item itm=new item(row);

        return itm;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        Log.i("triallllll",name.toString());
        ((item)holder).textView.setText(name[position]);


    }



    @Override
    public int getItemCount() {
        return name.length;
    }


    class item extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        public item(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView=(TextView)itemView.findViewById(R.id.textView1);
        }

        @Override
        public void onClick(View view) {
            int a=getAdapterPosition();

            Toast.makeText(context, this.textView.getText(),Toast.LENGTH_SHORT).show();

        }
    }



}
