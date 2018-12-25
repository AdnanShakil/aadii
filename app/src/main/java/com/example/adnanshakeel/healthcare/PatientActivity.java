package com.example.adnanshakeel.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

class PatientActivity extends AppCompatActivity
{
    RecyclerView programmingList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        programmingList=(RecyclerView) findViewById(R.id.programmingList1);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[]languages={"Patient#1","Patient#2","Patient#3","Patient#4","Patient#5","Patient#6","Patient#7","Patient#8","Patient#9","Patient#10","Patient#11","Patient#12","Patient#13","Patient#14"};
        programmingList.setAdapter(new MyAdapter1(languages,this));
    }
}
