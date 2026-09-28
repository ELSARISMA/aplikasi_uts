package com.elsa_risma_f52124066.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listViewTeman;
    TextView tvJumlah;

    // Nama teman
    String[] nama = {
            "Elsa",
            "Chece",
            "Acha",
            "Desi",
            "Sipa",
            "May",
            "Icha",
            "Atih"
    };

    // NIM
    String[] nim = {
            "F52124066",
            "F52124067",
            "F52124068",
            "F52124069",
            "F52124070",
            "F52124071",
            "F52124072",
            "F52124073"
    };

    // Program Studi
    String[] prodi = {
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi"
    };

    // Status
    String[] status = {
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif"
    };

    // Foto teman dari folder drawable
    int[] foto = {
            R.drawable.elsa,
            R.drawable.chece,
            R.drawable.acha,
            R.drawable.desi,
            R.drawable.sipa,
            R.drawable.may,
            R.drawable.icha,
            R.drawable.atih
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Menghubungkan komponen XML
        listViewTeman = findViewById(R.id.listViewTeman);
        tvJumlah = findViewById(R.id.tvJumlah);

        // Menampilkan jumlah teman
        tvJumlah.setText(nama.length + " Orang");

        // Membuat Custom Adapter
        TemanAdapter adapter = new TemanAdapter(
                this,
                nama,
                nim,
                prodi,
                status,
                foto
        );

        // Memasang adapter ke ListView
        listViewTeman.setAdapter(adapter);
    }
}