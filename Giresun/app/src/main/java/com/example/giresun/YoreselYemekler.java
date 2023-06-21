package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class YoreselYemekler extends AppCompatActivity {
    ListView listView_sby2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoresel_yemekler);

        ListView listView_yemekler=findViewById(R.id.listView_Yemekler);
        List<String> list_yemekler = new ArrayList<>();
        list_yemekler.add("Hamsili Pilav");
        list_yemekler.add("Karalahana Çorbası");
        list_yemekler.add("Siron");
        list_yemekler.add("Karalahana Sarması");

        ArrayAdapter adapter_sby2=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list_yemekler);
        listView_yemekler.setAdapter(adapter_sby2);

        listView_yemekler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //Hamsili Pilav
                    startActivity(new Intent(YoreselYemekler.this,hamsilipilav_sby.class));
                } else if (position==1) {
                    //Karalahana Çorbası
                    startActivity(new Intent(YoreselYemekler.this,corba_sby.class));
                } else if (position==2) {
                    //Siron
                    startActivity(new Intent(YoreselYemekler.this,siron_sby.class));
                } else if (position==3) {
                    //Karalahana Sarması
                    startActivity(new Intent(YoreselYemekler.this,sarma_sby.class));
                }

            }
        });
    }
}