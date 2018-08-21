package com.example.ibeth.project_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class PenjelasanActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        Intent intent = getIntent();
        int position = intent.getIntExtra("posisi", 0);
        String [] namaObat = intent.getStringArrayExtra("namaObat");

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(namaObat[position]);

        String [] sumber = {getResources().getString(R.string.acyclovir1), getResources().getString(R.string.allopurinol1),
                            getResources().getString(R.string.ambroxol1), getResources().getString(R.string.amoksisilin1),
                            getResources().getString(R.string.ampicillin1), getResources().getString(R.string.mefenamat1),
                            getResources().getString(R.string.bacitracin1), getResources().getString(R.string.bromhexine1),
                            getResources().getString(R.string.cetirizin1), getResources().getString(R.string.cipro1),
                            getResources().getString(R.string.dexamethasone1), getResources().getString(R.string.dextro1),
                            getResources().getString(R.string.diazepam1), getResources().getString(R.string.ethambutol1),
                            getResources().getString(R.string.fluconazole1), getResources().getString(R.string.furosemid1),
                            getResources().getString(R.string.gentamicin1), getResources().getString(R.string.glimepiride1),
                            getResources().getString(R.string.gliserol1), getResources().getString(R.string.ketoconazole1),
                            getResources().getString(R.string.ketorolac1), getResources().getString(R.string.levofloxacin1),
                            getResources().getString(R.string.metformin1), getResources().getString(R.string.mikonazol1),
                            getResources().getString(R.string.nifedipin1), getResources().getString(R.string.nikotinamid1),
                            getResources().getString(R.string.omeprazole1), getResources().getString(R.string.pct1),
                            getResources().getString(R.string.piroxicam1), getResources().getString(R.string.propanolol1),
                            getResources().getString(R.string.ranitidin1), getResources().getString(R.string.rifampicin1),
                            getResources().getString(R.string.salbutamol1), getResources().getString(R.string.tramadol1)
                        };
        String [] sumber2 = {getResources().getString(R.string.acyclovir2), getResources().getString(R.string.allopurinol2),
                            getResources().getString(R.string.ambroxol2), getResources().getString(R.string.amoksisilin2),
                            getResources().getString(R.string.ampicillin2), getResources().getString(R.string.mefenamat2),
                            getResources().getString(R.string.bacitracin2), getResources().getString(R.string.bromhexine2),
                            getResources().getString(R.string.cetirizin2), getResources().getString(R.string.cipro2),
                            getResources().getString(R.string.dexamethasone2), getResources().getString(R.string.dextro2),
                            getResources().getString(R.string.diazepam2), getResources().getString(R.string.ethambutol2),
                            getResources().getString(R.string.fluconazole2), getResources().getString(R.string.furosemid2),
                            getResources().getString(R.string.gentamicin2), getResources().getString(R.string.glimepiride2),
                            getResources().getString(R.string.gliserol2), getResources().getString(R.string.ketoconazole2),
                            getResources().getString(R.string.ketorolac2), getResources().getString(R.string.levofloxacin2),
                            getResources().getString(R.string.metformin2), getResources().getString(R.string.mikonazol2),
                            getResources().getString(R.string.nifedipin2), getResources().getString(R.string.nikotinamid2),
                            getResources().getString(R.string.omeprazole2), getResources().getString(R.string.pct2),
                            getResources().getString(R.string.piroxicam2), getResources().getString(R.string.propanolol2),
                            getResources().getString(R.string.ranitidin2), getResources().getString(R.string.rifampicin2),
                            getResources().getString(R.string.salbutamol2), getResources().getString(R.string.tramadol2)
                        };
        String [] sumber3 = {getResources().getString(R.string.acyclovir3), getResources().getString(R.string.allopurinol3),
                            getResources().getString(R.string.ambroxol3), getResources().getString(R.string.amoksisilin3),
                            getResources().getString(R.string.ampicillin3), getResources().getString(R.string.mefenamat3),
                            getResources().getString(R.string.bacitracin3), getResources().getString(R.string.bromhexine3),
                            getResources().getString(R.string.cetirizin3), getResources().getString(R.string.cipro3),
                            getResources().getString(R.string.dexamethasone3), getResources().getString(R.string.dextro3),
                            getResources().getString(R.string.diazepam3), getResources().getString(R.string.ethambutol3),
                            getResources().getString(R.string.fluconazole3), getResources().getString(R.string.furosemid3),
                            getResources().getString(R.string.gentamicin3), getResources().getString(R.string.glimepiride3),
                            getResources().getString(R.string.gliserol3), getResources().getString(R.string.ketoconazole3),
                            getResources().getString(R.string.ketorolac3), getResources().getString(R.string.levofloxacin3),
                            getResources().getString(R.string.metformin3), getResources().getString(R.string.mikonazol3),
                            getResources().getString(R.string.nifedipin3), getResources().getString(R.string.nikotinamid3),
                            getResources().getString(R.string.omeprazole3), getResources().getString(R.string.pct3),
                            getResources().getString(R.string.piroxicam3), getResources().getString(R.string.propanolol3),
                            getResources().getString(R.string.ranitidin3), getResources().getString(R.string.rifampicin3),
                            getResources().getString(R.string.salbutamol3), getResources().getString(R.string.tramadol3)
                        };
        String [] sumber4 = {getResources().getString(R.string.acyclovir4), getResources().getString(R.string.allopurinol4),
                            getResources().getString(R.string.ambroxol4), getResources().getString(R.string.amoksisilin4),
                            getResources().getString(R.string.ampicillin4), getResources().getString(R.string.mefenamat4),
                            getResources().getString(R.string.bacitracin4), getResources().getString(R.string.bromhexine4),
                            getResources().getString(R.string.cetirizin4), getResources().getString(R.string.cipro4),
                            getResources().getString(R.string.dexamethasone4), getResources().getString(R.string.dextro4),
                            getResources().getString(R.string.diazepam4), getResources().getString(R.string.ethambutol4),
                            getResources().getString(R.string.fluconazole4), getResources().getString(R.string.furosemid4),
                            getResources().getString(R.string.gentamicin4), getResources().getString(R.string.glimepiride4),
                            getResources().getString(R.string.gliserol4), getResources().getString(R.string.ketoconazole4),
                            getResources().getString(R.string.ketorolac4), getResources().getString(R.string.levofloxacin4),
                            getResources().getString(R.string.metformin4), getResources().getString(R.string.mikonazol4),
                            getResources().getString(R.string.nifedipin4), getResources().getString(R.string.nikotinamid4),
                            getResources().getString(R.string.omeprazole4), getResources().getString(R.string.pct4),
                            getResources().getString(R.string.piroxicam4), getResources().getString(R.string.propanolol4),
                            getResources().getString(R.string.ranitidin4), getResources().getString(R.string.rifampicin4),
                            getResources().getString(R.string.salbutamol4), getResources().getString(R.string.tramadol4)
                        };
        String [] sumber5 = {getResources().getString(R.string.acyclovir5), getResources().getString(R.string.allopurinol5),
                            getResources().getString(R.string.ambroxol5), getResources().getString(R.string.amoksisilin5),
                            getResources().getString(R.string.ampicillin5), getResources().getString(R.string.mefenamat5),
                            getResources().getString(R.string.bacitracin5), getResources().getString(R.string.bromhexine5),
                            getResources().getString(R.string.cetirizin5), getResources().getString(R.string.cipro5),
                            getResources().getString(R.string.dexamethasone5), getResources().getString(R.string.dextro5),
                            getResources().getString(R.string.diazepam5), getResources().getString(R.string.ethambutol5),
                            getResources().getString(R.string.fluconazole5), getResources().getString(R.string.furosemid5),
                            getResources().getString(R.string.gentamicin5), getResources().getString(R.string.glimepiride5),
                            getResources().getString(R.string.gliserol5), getResources().getString(R.string.ketoconazole5),
                            getResources().getString(R.string.ketorolac5), getResources().getString(R.string.levofloxacin5),
                            getResources().getString(R.string.metformin5), getResources().getString(R.string.mikonazol5),
                            getResources().getString(R.string.nifedipin5), getResources().getString(R.string.nikotinamid5),
                            getResources().getString(R.string.omeprazole5), getResources().getString(R.string.pct5),
                            getResources().getString(R.string.piroxicam5), getResources().getString(R.string.propanolol5),
                            getResources().getString(R.string.ranitidin5), getResources().getString(R.string.rifampicin5),
                            getResources().getString(R.string.salbutamol5), getResources().getString(R.string.tramadol5)
                        };

        TextView textView = (TextView) findViewById(R.id.text_penjelasan);
        TextView textView1 = (TextView) findViewById(R.id.text_penjelasan2);
        TextView textView2 = (TextView) findViewById(R.id.text_Dosis2);
        TextView textView3 = (TextView) findViewById(R.id.text_efekSamping2);
        TextView textView4 = (TextView) findViewById(R.id.text_peringatan2);

        textView.setText(sumber[position]);
        textView1.setText(sumber2[position]);
        textView2.setText(sumber3[position]);
        textView3.setText(sumber4[position]);
        textView4.setText(sumber5[position]);
    }
}
