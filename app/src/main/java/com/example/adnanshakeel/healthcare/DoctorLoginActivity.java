package com.example.adnanshakeel.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorLoginActivity extends AppCompatActivity {
    private Button btnlogin;
    private Button btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);
        btnlogin=findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DoctorLoginActivity.this,DoctorActivity.class);
                startActivity(intent);

            }
        });


        btnsignup=findViewById(R.id.btnDoctorSignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DoctorLoginActivity.this,DoctorSignupActivity.class);
                startActivity(intent);

            }
        });





    }
}
