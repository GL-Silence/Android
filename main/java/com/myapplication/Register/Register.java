package com.myapplication.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapplication.LogAndMain.ActivityLogin;
import com.myapplication.R;

public class Register extends AppCompatActivity {

    private Button register_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /*register_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, ActivityLogin.class);
                startActivity(intent);
            }
        });*/
    }
}
