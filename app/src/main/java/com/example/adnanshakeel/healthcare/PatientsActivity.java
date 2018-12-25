package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientsActivity extends AppCompatActivity {
    private Button btnappointment;
    private Button btnprevious_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);
        btnappointment=findViewById(R.id.btnAppointment1);

        btnappointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientsActivity.this,PatientAppointment.class);
                startActivity(intent);

            }
        });
        btnprevious_record=findViewById(R.id.btnPreviousRecord);

        btnprevious_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientsActivity.this,PatientHistory.class);
                startActivity(intent);

            }
        });
    }
}
