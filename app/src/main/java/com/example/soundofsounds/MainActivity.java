package com.example.soundofsounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button bt1;
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.button1);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.yes);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp1.start( );
            }
        });
        bt2 = (Button)findViewById(R.id.button2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.no);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp2.start();
            }
        });
    }
}