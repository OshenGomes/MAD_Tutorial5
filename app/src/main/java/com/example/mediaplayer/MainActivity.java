package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button Startbutton;
    Button Stopbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
//        player.setLooping(true);
//        player.start();

        Startbutton = findViewById(R.id.btnStart);
        Startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyServices.class));
            }
        });

        Stopbutton = findViewById(R.id.btnStop);
        Stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, MyServices.class));
            }
        });

    }

}