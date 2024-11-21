package com.example.myfinalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Twelfth extends AppCompatActivity {
    EditText e8;
    Button b36,b37;
    WebView w1;
    FirebaseAuth firebaseAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twelfth);
        e8=(EditText)findViewById(R.id.editTextText8);
        b36=(Button) findViewById(R.id.button36);
        b37=(Button) findViewById(R.id.button37);
        w1=(WebView) findViewById(R.id.webView);
        firebaseAuth=FirebaseAuth.getInstance();
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                w1.loadUrl(s1);
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                Intent s=new Intent(Twelfth.this,MainActivity.class);
                startActivity(s);
                finish();
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}