package com.example.hakan.gykcustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<Ogrenciler> ogrencilerArrayList = new ArrayList<Ogrenciler>();

        ogrencilerArrayList.add(new Ogrenciler(R.drawable.ic_foto,"Gözde Yaşar", "12:46:08"));
        ogrencilerArrayList.add(new Ogrenciler(R.drawable.ic_foto_2, "Hüseyin Çoşkun","02:15:15"));
        ogrencilerArrayList.add(new Ogrenciler(R.drawable.ic_foto_3, "Seda Karataş", "01:16:30"));

        CustomAdapter customAdapter = new CustomAdapter(this, ogrencilerArrayList);

        listView.setAdapter(customAdapter);
    }
}
