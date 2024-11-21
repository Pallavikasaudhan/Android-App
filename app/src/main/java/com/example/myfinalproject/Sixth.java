package com.example.myfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Sixth extends AppCompatActivity {
    Button b10,b11,b12,b13,b14,b15,b16,b17,b18,b35,b19;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixth);
        b10=(Button) findViewById(R.id.button10);
        b11=(Button) findViewById(R.id.button11);
        b12=(Button) findViewById(R.id.button12);
        b13=(Button) findViewById(R.id.button13);
        b14=(Button) findViewById(R.id.button14);
        b15=(Button) findViewById(R.id.button15);
        b16=(Button) findViewById(R.id.button16);
        b17=(Button) findViewById(R.id.button17);
        b18=(Button) findViewById(R.id.button18);
        b35=(Button) findViewById(R.id.button35);
        b19=(Button) findViewById(R.id.button19);
        firebaseAuth=FirebaseAuth.getInstance();
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sixth.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Sixth.this,Eighth.class);
                startActivity(j);
                finish();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Sixth.this, Ninth.class);
                startActivity(k);
                finish();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Sixth.this, Tenth.class);
                startActivity(l);
                finish();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Sixth.this, Eleventh.class);
                startActivity(m);
                finish();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Sixth.this, Twelfth.class);
                startActivity(n);
                finish();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(Sixth.this, Thirteen.class);
                startActivity(o);
                finish();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Sixth.this, Fourteen.class);
                startActivity(p);
                finish();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q=new Intent(Sixth.this, Fifteen.class);
                startActivity(q);
                finish();
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(Sixth.this, Sixteen.class);
                startActivity(r);
                finish();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                Intent s=new Intent(Sixth.this,MainActivity.class);
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