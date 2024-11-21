package com.example.myfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nineteen extends AppCompatActivity {
    TextView t24;
    Button b46,b47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nineteen);
        t24.setText("Your Score is : "+Sixteen.score);
        b46=(Button)findViewById(R.id.button46);
        b47=(Button)findViewById(R.id.button47);

        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                score=0;
                Toast.makeText(Nineteen.this, "ho gya ", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Nineteen.this, Sixteen.class);
                startActivity(i);
                finish();
            }
        });
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                score=0;
                Intent i=new Intent(Nineteen.this, MainActivity.class);
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