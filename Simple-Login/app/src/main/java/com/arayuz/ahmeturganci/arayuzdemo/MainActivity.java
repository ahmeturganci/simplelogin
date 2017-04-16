package com.arayuz.ahmeturganci.arayuzdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button createNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        createNew = (Button) findViewById(R.id.createNew);
         createNew.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent newPage = new Intent(MainActivity.this,SiginupActivity.class);
                 startActivity(newPage);
             }
         });
    }
}
