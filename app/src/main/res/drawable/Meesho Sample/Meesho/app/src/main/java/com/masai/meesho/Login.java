package com.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import vijay.masai.meesho.Sign_up;
import vijay.masai.meesho.firstPage;

public class Login extends AppCompatActivity {
    private TextView t;
    private TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t=findViewById(R.id.textView3);
        v=findViewById(R.id.textView4);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(vijay.masai.meesho.Login.this, firstPage.class);
                startActivity(i);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(vijay.masai.meesho.Login.this, Sign_up.class);
                startActivity(i);
            }
        });
    }
}