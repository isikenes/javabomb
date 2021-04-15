package com.ei.bomb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    public void start(View view) {
        new CountDownTimer(5000,1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("00:0"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        }.start();
    }
}