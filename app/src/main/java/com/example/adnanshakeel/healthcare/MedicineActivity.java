package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MedicineActivity extends AppCompatActivity {
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        share = (Button) findViewById(R.id.btnPrint);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Receipt Generated", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MedicineActivity.this,Receipt.class);
                startActivity(intent);


            }
        });



    }


}