package com.example.converterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button temperature,mass,weight,length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperature=findViewById(R.id.temperature);
        mass=findViewById(R.id.mass);
        weight=findViewById(R.id.weight);
        length=findViewById(R.id.lenght);

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp=new Intent(MainActivity.this,Temperature.class);
                startActivity(temp);
                finish();
            }
        });

        mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mass=new Intent(MainActivity.this,Mass.class);
                startActivity(mass);
                finish();
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weight=new Intent(MainActivity.this,Weight.class);
                startActivity(weight);
                finish();
            }
        });

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lenght=new Intent(MainActivity.this,Lenght.class);
                startActivity(lenght);
                finish();
            }
        });
    }
}
