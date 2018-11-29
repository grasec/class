package com.mistforged.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static com.mistforged.myapplication.MainActivity.SELECTION;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int selectedButton = getIntent().getIntExtra(SELECTION, -1);
        Toast.makeText(this, "Tag:" + selectedButton, Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.textView);
        textView.setText("Tag" + selectedButton);
    }


}
