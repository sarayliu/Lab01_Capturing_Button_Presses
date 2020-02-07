package com.liusara.lab01capturingbuttonpresses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView displayText;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.incrementButton);
        displayText = findViewById(R.id.textBox);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Log.i("testButton1", "" + count);
                String concatenatedString = "Lab01: Capturing Button Presses\nIncrement: " + count;
                displayText.setText(concatenatedString);
            }
        });
    }

    public void changeColor(View view) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(265), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
    }
}
