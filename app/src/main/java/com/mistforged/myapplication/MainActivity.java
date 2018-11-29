package com.mistforged.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String SELECTION = "selection";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectedButton(int selection) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SELECTION, selection);
        startActivity(intent);
    }

    public void goToSecondActivity(View view) {
        int tagNum = Integer.valueOf((String) view.getTag());
        selectedButton(tagNum);
    }
}
