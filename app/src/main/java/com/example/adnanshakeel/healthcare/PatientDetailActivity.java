package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientDetailActivity extends AppCompatActivity {
    private Button btnprescription;
    private Button btnhistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detail);
        btnprescription=findViewById(R.id.btnPrescription);

        btnprescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientDetailActivity.this,MedicineActivity.class);
                startActivity(intent);

            }
        });
        btnhistory=findViewById(R.id.btnHistory);

        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientDetailActivity.this,HistoryActivity.class);
                startActivity(intent);

            }
        });







    }
}
