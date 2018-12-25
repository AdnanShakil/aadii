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

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ProgrammingViewHolder>
{

    private Context mcontext;
    private String[] data;
    MyAdapter(String[] data,Context c)
    {
        this.mcontext=c;
        this.data=data;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position)
    {
        String title=data[position];
        holder.txtTitle.setText(title);
        holder.txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mcontext,PatientDetailActivity.class);
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
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imgIcon=(ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle=(TextView) itemView.findViewById(R.id.txtTitle);



        }




    }
}

