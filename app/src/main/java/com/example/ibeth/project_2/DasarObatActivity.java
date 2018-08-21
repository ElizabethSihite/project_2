package com.example.ibeth.project_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DasarObatActivity extends AppCompatActivity {

    private Button SimpanObat;
    private Button DosisObat;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasarobat);

        SimpanObat = (Button) findViewById(R.id.btnSimpanObat);
        SimpanObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simpanobatintent = new Intent(DasarObatActivity.this, SimpanObatActivity.class);
                startActivity(simpanobatintent);
            }
        });

        DosisObat = (Button) findViewById(R.id.btnDosisObat);
        DosisObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dosisobatintent = new Intent(DasarObatActivity.this, DosisObatActivity.class);
                startActivity(dosisobatintent);
            }
        });
    }
}

