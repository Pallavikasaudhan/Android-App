package com.example.myfinalproject;

import android.annotation.SuppressLint;
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

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b2,b3,b4,b52;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editTextText);
        e2=(EditText)findViewById(R.id.editTextText2);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b52=(Button)findViewById(R.id.button52);
        progressBar=(ProgressBar) findViewById(R.id.progressBar);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        firebaseAuth=FirebaseAuth.getInstance();
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String s1=e1.getText().toString().trim();
        String s2=e2.getText().toString();
        if(s1.isEmpty()){
            e1.setError("Enter Your Email ID");
            return;
        }
        else {
            if(s2.isEmpty()){
                e2.setError("Please fill your password");
                return;
            }
            else{
                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this, "login Done", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(MainActivity.this, Fifth.class);
                            startActivity(i);
                            finish();

                        }
                        else{
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this, "Mismatch User", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        }
    }
});
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Intent j=new Intent(MainActivity.this, Second.class);
    startActivity(j);
    finish();
    }
});//third
b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent k=new Intent(MainActivity.this, Third.class);
        startActivity(k);
        finish();
    }
});
b52.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(MainActivity.this, Sixth.class);
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