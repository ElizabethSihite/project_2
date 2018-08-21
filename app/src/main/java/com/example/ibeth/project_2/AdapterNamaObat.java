package com.example.ibeth.project_2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AdapterNamaObat extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    private List<NamaObatModel> modelList;
    private ArrayList<NamaObatModel> listTemp;

    //ini constructor, buat pas manggil adapter di activity

    public AdapterNamaObat(Context context, List<NamaObatModel> modelList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.modelList = modelList;
        this.listTemp = new ArrayList<NamaObatModel>();
        this.listTemp.addAll(modelList);
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //get view ini intinya buat manggil layout (xml) yang buat dalemnya list daftar obat

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_nama_obat, null);
            holder.textnamaObat = (TextView) convertView.findViewById(R.id.text_namaObat);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textnamaObat.setText(modelList.get(position).getNamaObat().toString());
        return convertView;
    }

    public class ViewHolder {
        TextView textnamaObat;
    }

    //fungsi untuk filter list daftar obat

    public void filter (String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if(charText.length() == 0){
            modelList.addAll(listTemp);
        }
        else
        {
            for(NamaObatModel model : listTemp){
                if(model.getNamaObat().toLowerCase(Locale.getDefault()).contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
