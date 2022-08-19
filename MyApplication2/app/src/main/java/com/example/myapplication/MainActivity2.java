package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView old = findViewById(R.id.old);
        TextView name = findViewById(R.id.name);


        Bundle bundle = getIntent().getExtras();
        String ahmed = bundle.getString("item1");
        int old2 = bundle.getInt("Item2");

        old.setText(old2+"");
        name.setText(ahmed);

    }
    }
