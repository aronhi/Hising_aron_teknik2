package com.example.ah980627.hising_aron_teknik;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
// ska vara en bakåtknapp vet ej om det funkar kan ej köra emulator
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
// går till vetenskap
    public void onClickVet(View v){

        if (v.getId()==R.id.button){
            Intent i = new Intent(Main2Activity.this, Main3ActivityVetenskap.class);
            startActivity(i);
        }
    }
//går till design
    public void onClickDesign(View v){

        if (v.getId()==R.id.button4){
            Intent i = new Intent(Main2Activity.this, Main4Activity_design.class);
            startActivity(i);
        }
    }
    //går till It
    public void onClickIt(View v){

        if (v.getId()==R.id.button5){
            Intent i = new Intent(Main2Activity.this, Main5ActivityIt.class);
            startActivity(i);
        }
    }
//går till sam
    public void onClickSam(View v){

        if (v.getId()==R.id.button6){
            Intent i = new Intent(Main2Activity.this, Main6ActivitySam.class);
            startActivity(i);
        }
    }
}
