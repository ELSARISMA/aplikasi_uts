package com.elsa_risma_f52124066.aplikasi_uts;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TemanAdapter extends BaseAdapter {

    private Context context;
    private String[] nama;
    private String[] nim;
    private String[] prodi;
    private String[] status;
    private int[] foto;

    public TemanAdapter(
            Context context,
            String[] nama,
            String[] nim,
            String[] prodi,
            String[] status,
            int[] foto) {

        this.context = context;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.status = status;
        this.foto = foto;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public Object getItem(int position) {
        return nama[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_teman, parent, false);
        }

        // Menghubungkan komponen dari item_teman.xml
        ImageView ivFoto = convertView.findViewById(R.id.ivFoto);
        TextView tvNama = convertView.findViewById(R.id.tvNama);
        TextView tvNim = convertView.findViewById(R.id.tvNim);
        TextView tvProdi = convertView.findViewById(R.id.tvProdi);
        TextView tvStatus = convertView.findViewById(R.id.tvStatus);

        // Menampilkan foto
        ivFoto.setImageResource(foto[position]);

        // Menampilkan data teman
        tvNama.setText(nama[position]);
        tvNim.setText("NIM: " + nim[position]);
        tvProdi.setText("Prodi: " + prodi[position]);
        tvStatus.setText("● " + status[position]);

        return convertView;
    }
}