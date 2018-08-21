package com.example.ibeth.project_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DaftarObatActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listDaftarObat;
    String namaObat [] = new String[]{"Acyclovir", "Allopurinol", "Ambroxol", "Amoxicillin", "Ampicillin", "Asam Mefenamat",
                        "Bacitracin", "Bromhexine", "Cetirizine", "Ciprofloxacin", "Dexamethasone", "Dextrometorphan",
                        "Diazepam", "Ethambutol", "Fluconazole", "Furosemide", "Gentamicin", "Glimepiride", "Gliserol",
                        "Ibuprofen", "Ketokonazone", "Ketorolac", "Levofloxacin", "Metformin", "Mikonazol",
                        "Nifedipin", "Nikotinamid", "Obat Batuk Hitam (OBH)", "Parasetamol (Acetaminophen)", "Piroxicam",
                        "Propanolol", "Ranitidin", "Rifampicin", "Salbutamol", "Tramadol"};
    private EditText etSearch;
    AdapterNamaObat adapterNamaObat;
    ArrayList<NamaObatModel> arrayList = new ArrayList<NamaObatModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarobat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etSearch = (EditText) findViewById(R.id.et_search);
        listDaftarObat = (ListView) findViewById(R.id.list_daftarObat);

        //supaya listDaftarObat nya bisa di klik

        listDaftarObat.setOnItemClickListener(this);

        //add data dari string namaObat[] ke model yang jadi sumber data

        for(int i = 0 ; i < namaObat.length ; i++){
            NamaObatModel model = new NamaObatModel(namaObat[i]);
            arrayList.add(model);
        }

        //set adapter buat masukin data dari string namaobat[] ke listDaftarObat

        adapterNamaObat = new AdapterNamaObat(this, arrayList);
        listDaftarObat.setAdapter(adapterNamaObat);

        //buat search

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = etSearch.getText().toString().toLowerCase();
                adapterNamaObat.filter(text);
            }
        });
    }
    //untuk pindah dari list saat di klik ke penjelasan activity

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, PenjelasanActivity.class);
        intent.putExtra("posisi", position);
        intent.putExtra("namaObat", namaObat);
        startActivity(intent);
    }
}
