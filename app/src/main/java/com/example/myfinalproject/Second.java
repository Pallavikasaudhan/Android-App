package com.example.myfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Second extends AppCompatActivity {
    EditText e3,e4;
    ProgressBar progressBar2;
    Button b1,b5;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        e3=(EditText)findViewById(R.id.editTextText3);
        e4=(EditText)findViewById(R.id.editTextText4);
        e4.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b1=(Button)findViewById(R.id.button);
        b5=(Button)findViewById(R.id.button5);
        progressBar2=(ProgressBar)findViewById(R.id.progressBar2);
        firebaseAuth=FirebaseAuth.getInstance();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String s3=e3.getText().toString().trim();
             String s4=e4.getText().toString();
             if(s3.isEmpty()){
                 e3.setError("Fill Email");
                 return;
             }
             else{
                 if(s4.isEmpty()){
                     e4.setError("Fill Password");
                     return;
                 }
                 else{
                     progressBar2.setVisibility(View.VISIBLE);
                     firebaseAuth.createUserWithEmailAndPassword(s3,s4).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                         @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                             if(task.isSuccessful()){
                                 progressBar2.setVisibility(View.INVISIBLE);
                                 Toast.makeText(Second.this, "Update Database", Toast.LENGTH_SHORT).show();
                                 Intent j=new Intent(Second.this, MainActivity.class);
                                 startActivity(j);
                                 finish();
                             }
                             else{
                                 progressBar2.setVisibility(View.INVISIBLE);
                                 Toast.makeText(Second.this, "Invalid Data", Toast.LENGTH_SHORT).show();
                             }
                         }
                     });
                 }
             }

        }
    });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this, MainActivity.class);
                startActivity(i);
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