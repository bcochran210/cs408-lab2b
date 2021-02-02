package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] helpItems;
    private String helpItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helpItems = getResources().getStringArray(R.array.Help_List);
        helpItem = "";
    }

    public void onClickGetHelpButton(View view) {
        helpItem = getRandomIndex(helpItems);

        TextView resultText = (TextView)findViewById(R.id.resultText);
        resultText.setText(helpItem);
    }

    public static String getRandomIndex(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}