package com.example.myfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Seventeen extends AppCompatActivity {
    RadioButton r5,r6,r7,r8;
    Button b44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seventeen);
        r5=findViewById(R.id.radioButton5);
        r6=findViewById(R.id.radioButton6);
        r7=findViewById(R.id.radioButton7);
        r8=findViewById(R.id.radioButton8);

        b44=(Button) findViewById(R.id.button44);

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r6.isChecked()){
                    ++Sixteen.score;
                }
                else{
                    --Sixteen.score;
                }
                Intent i=new Intent(Seventeen.this, Eighteen.class);
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