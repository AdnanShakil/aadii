package com.example.adnanshakeel.healthcare;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.ProgrammingViewHolder>
{

    private Context mcontext;
    private String[] data;
    MyAdapter1(String[] data,Context c)
    {
        this.mcontext=c;
        this.data=data;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row_layout1,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position)
    {
        String title=data[position];
        holder.txtTitle1.setText(title);
        holder.txtTitle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mcontext,RecordActivity.class);
                mcontext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon1;
        TextView txtTitle1;
        public ProgrammingViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imgIcon1=(ImageView) itemView.findViewById(R.id.imgIcon1);
            txtTitle1=(TextView) itemView.findViewById(R.id.txtTitle1);



        }




    }
}

