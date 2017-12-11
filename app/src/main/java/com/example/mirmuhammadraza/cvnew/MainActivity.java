package com.example.mirmuhammadraza.cvnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    public  void  personlinfo(View view)
    {
        Intent intent = new Intent(MainActivity.this,Personalinfo.class);
        startActivity(intent);
    }
    public  void  educationalinfo(View view)
    {
        Intent intent = new Intent(MainActivity.this,Educationalinfo.class);
        startActivity(intent);
    }
    public  void  experience(View view)
    {
        Intent intent = new Intent(MainActivity.this,Experience.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
