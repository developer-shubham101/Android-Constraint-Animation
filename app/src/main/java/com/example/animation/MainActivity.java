package com.example.animation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnAnimation1).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Animation1Activity.class)));
        findViewById(R.id.btnAnimation2).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Animation2Activity.class)));
        findViewById(R.id.btnAnimation3).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Animation3Activity.class)));
        findViewById(R.id.btnAnimation4).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Animation4Activity.class)));


    }


}
