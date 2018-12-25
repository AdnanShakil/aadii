package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorActivity extends AppCompatActivity {
private Button btnappointment;
private Button btnpatient_record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        btnappointment=findViewById(R.id.btnAppointment);

        btnappointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DoctorActivity.this,AppointmentListActivity.class);
                startActivity(intent);

            }
        });
        btnpatient_record=findViewById(R.id.btnPatient_Record);

        btnpatient_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DoctorActivity.this,PatientActivity.class);
                startActivity(intent);

            }
        });


    }
}
