package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientLoginActivity extends AppCompatActivity {
    private Button btnlogin;
    private Button btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
        btnlogin=findViewById(R.id.btnPatientLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientLoginActivity.this,PatientsActivity.class);
                startActivity(intent);

            }
        });
        btnsignup=findViewById(R.id.btnPatientSignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PatientLoginActivity.this,PatientSignupActivity.class);
                startActivity(intent);

            }
        });
    }
}
