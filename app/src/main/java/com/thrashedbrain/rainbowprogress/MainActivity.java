package com.thrashedbrain.rainbowprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;

import com.thrashedbrain.rainbowprogressbar.RainbowProgressBar;

public class MainActivity extends AppCompatActivity {
    RainbowProgressBar rainbowProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rainbowProgressBar = findViewById(R.id.progress2);

        new CountDownTimer(5000, 50){
            int progress = 0;

            @Override
            public void onTick(long l) {
                progress++;
                rainbowProgressBar.setProgress(progress);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
