package com.example.waterreminder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Gets intent and displays the info text
 */

public class InfoText extends AppCompatActivity {

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infopage);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.info);





    }
}