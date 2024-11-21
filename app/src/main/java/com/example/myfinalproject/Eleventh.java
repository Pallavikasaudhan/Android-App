package com.example.myfinalproject;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Eleventh extends AppCompatActivity {
    Button b32,b33,b34;
    FirebaseAuth firebaseAuth;
    CameraManager cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eleventh);
        b32=(Button) findViewById(R.id.button32);
        b33=(Button) findViewById(R.id.button33);
        b34=(Button) findViewById(R.id.button34);
        firebaseAuth=FirebaseAuth.getInstance();
        cm=(CameraManager) getSystemService(CAMERA_SERVICE);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String id=cm.getCameraIdList()[0];
                    cm.setTorchMode(id,true);
                }
                catch(CameraAccessException e)
                {
                }
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String id=cm.getCameraIdList()[0];
                    cm.setTorchMode(id,false);
                }
                catch(CameraAccessException e)
                {
                }
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                Intent s=new Intent(Eleventh.this, Sixth  .class);
                startActivity(s);
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