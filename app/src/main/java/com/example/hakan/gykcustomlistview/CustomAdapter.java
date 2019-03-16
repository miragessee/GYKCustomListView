package com.example.hakan.gykcustomlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Ogrenciler> ogrencilerArrayList;

    public CustomAdapter(Context context, ArrayList<Ogrenciler> ogrencilerArrayList) {
        this.context = context;
        this.ogrencilerArrayList = ogrencilerArrayList;
    }

    @Override
    public int getCount() {
        return ogrencilerArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return ogrencilerArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final View v = View.inflate(context, R.layout.row, null);

        ImageView imageView = v.findViewById(R.id.imageView);
        TextView textView = v.findViewById(R.id.textView);
        TextView textView2 = v.findViewById(R.id.textView2);

        imageView.setImageResource(ogrencilerArrayList.get(position).foto);
        textView.setText(ogrencilerArrayList.get(position).isim);
        textView2.setText(ogrencilerArrayList.get(position).tarih);

        return v;
    }
}
