package com.example.myfinalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Fifteen extends AppCompatActivity {
    EditText e7,e9;
    Button b48,b49,b50,b51,b42;
    TextView t12;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fifteen);
        e7=(EditText) findViewById(R.id.editTextText7);
        e9=(EditText) findViewById(R.id.editTextText9);
        b48=(Button) findViewById(R.id.button48);
        b49=(Button) findViewById(R.id.button49);
        b50=(Button) findViewById(R.id.button50);
        b51=(Button) findViewById(R.id.button51);
        b42=(Button) findViewById(R.id.button42);

        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e7.getText().toString();
                String s2=e9.getText().toString();
                Integer i1= Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1+i2;
                String s3=Integer.toString(i3);
                t12.setText(s3);
            }
        });
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e7.getText().toString();
                String s2=e9.getText().toString();
                Integer i1= Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1-i2;
                String s3=Integer.toString(i3);
                t12.setText(s3);
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e7.getText().toString();
                String s2=e9.getText().toString();
                Integer i1= Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1*i2;
                String s3=Integer.toString(i3);
                t12.setText(s3);
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e7.getText().toString();
                String s2=e9.getText().toString();
                Integer i1= Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1/i2;
                String s3=Integer.toString(i3);
                t12.setText(s3);
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fifteen.this, Sixth.class);
                startActivity(i);
                finish();
            }
        });
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}