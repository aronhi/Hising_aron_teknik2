package com.example.ah980627.hising_aron_teknik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //går till program val
    public void onButtonSpecClick(View v){

        if (v.getId()==R.id.button2){
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
        }
    }

}
