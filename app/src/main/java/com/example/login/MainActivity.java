 package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    TextView tv1,tvNAme,tvPassword;
    EditText etName,etPassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etPassword=findViewById(R.id.etPassword);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= etName.getText().toString();
                String Pass=etPassword.getText().toString();


                if (name.equals("Pratiksha")&&Pass.equals("123456")) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(MainActivity.this,MainActivity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("password",Pass);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Enter correct credentials \n name:Pratiksha \nPassword:123456", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}