package com.example.ibeth.project_2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
{
    private Button Pedoman;
    private Button DasarObat;
    private Button DaftarObat;
    private Button Exit;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // fungsi turunan button dari class diatas. setOnClickListener dipakai buat panggil activity
        Pedoman = (Button) findViewById(R.id.btnPedoman);
        Pedoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pedomanintent=new Intent(MenuActivity.this, PedomanActivity.class);
                startActivity(pedomanintent);
            }
        });

        DasarObat = (Button) findViewById(R.id.btnDasarObat);
        DasarObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dasarobatintent=new Intent(MenuActivity.this, DasarObatActivity.class);
                startActivity(dasarobatintent);
            }
        });

        DaftarObat = (Button) findViewById(R.id.btnDaftarObat);
        DaftarObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarobatintent=new Intent(MenuActivity.this, DaftarObatActivity.class);
                startActivity(daftarobatintent);
            }
        });

        Exit = (Button) findViewById(R.id.btnExit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               makeDialog();
            }
        });
    }

    //karna ini gak ada activitynya makanya harus pake dialog builder
    private void makeDialog (){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Apakah anda ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        dialog = builder.create();
        dialog.show();
    }
}
