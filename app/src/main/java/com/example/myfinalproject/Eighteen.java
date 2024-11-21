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

public class Eighteen extends AppCompatActivity {
    RadioButton r9,r10,r11,r12;
    Button b45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eighteen);
        r9=findViewById(R.id.radioButton9);
        r10=findViewById(R.id.radioButton10);
        r11=findViewById(R.id.radioButton11);
        r12=findViewById(R.id.radioButton12);

        b45=(Button) findViewById(R.id.button45);

        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r11.isChecked()){
                    ++Sixteen.score;
                }
                else{
                    --Sixteen.score;
                }
                Intent i=new Intent(Eighteen.this, Nineteen.class);
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