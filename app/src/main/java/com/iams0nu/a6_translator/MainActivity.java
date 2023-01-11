package com.iams0nu.a6_translator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    public void playphrase(View view)
    {
        Button btn = (Button) view;
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(btn.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}