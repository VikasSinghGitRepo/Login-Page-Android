package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
//        String name = getIntent().getStringExtra("username");
//        String password = getIntent().getStringExtra("password");
        String name = getIntent().getExtras().getString("name");
        String password = getIntent().getExtras().getString("password");
        textView.setText(name + "\n" + password);
//        if (name.equals("someone")) {
//            Toast.makeText(MainActivity2.this, "Login Successful", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(this, "Enter correct credentials", Toast.LENGTH_SHORT).show();
//        }
    }

    }
