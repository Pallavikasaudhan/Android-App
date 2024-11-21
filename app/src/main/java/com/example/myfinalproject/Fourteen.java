package com.example.myfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Fourteen extends AppCompatActivity {
    Button b40,b41;
    VideoView v1;
    MediaController m1;
    Uri VideoUri;
    Uri videoUri = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fourteen);
        b40 = (Button) findViewById(R.id.button40);
        b41 = (Button) findViewById(R.id.button41);
        v1 = (VideoView) findViewById(R.id.videoView);
        m1 = new MediaController(this);

        v1.setMediaController(m1);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(j, 99);

            }
        });


        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fourteen.this, Sixth.class);
                startActivity(i);
                finish();
            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == 99) {
                if (resultCode == RESULT_OK) {

                    // Video captured and saved to fileUri specified in the Intent
                    videoUri = data.getData();
                    v1.setVideoURI(videoUri);
                    v1.start(); // Start playback
                }
            }
        }



//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
}
