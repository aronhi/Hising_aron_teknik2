package com.example.ah980627.hising_aron_teknik;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Main3ActivityVetenskap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_vetenskap);
        // ska vara en bakåtknapp vet ej om det funkar kan ej köra emulator
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
