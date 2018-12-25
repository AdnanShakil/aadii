package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
private Button btndoctor;
private Button btnpatient;
//private Button btnassistant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btndoctor=findViewById(R.id.btnDoctor);

        btndoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,DoctorLoginActivity.class);
                startActivity(intent);

            }
        });
        btnpatient=findViewById(R.id.btnPatient);

        btnpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,PatientLoginActivity.class);
                startActivity(intent);

            }
        });




    }
}
