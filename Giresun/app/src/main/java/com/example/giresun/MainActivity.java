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

public class MainActivity extends AppCompatActivity {
     ListView listView_sby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView_sby=  findViewById(R.id.listView_AnaMenu);
        List<String> list_sby = new ArrayList<>();
        list_sby.add("Giresun Tarihçesi");
        list_sby.add("Giresun Tarihi Yerler");
        list_sby.add("Giresun Yöresel Yemekler");
        list_sby.add("Giresun Yöresel Tatlılar");



       ArrayAdapter adapter_sby=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list_sby);
        listView_sby.setAdapter(adapter_sby);

        listView_sby.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    //Tarihçe
                    startActivity(new Intent(MainActivity.this,Tarihce.class));
                } else if (position==1) {
                    //Tarihi Yerler
                    startActivity(new Intent(MainActivity.this,TarihiYerler.class));

                }else if (position==2){
                    //YoreselYemekler
                    startActivity(new Intent(MainActivity.this,YoreselYemekler.class));

                } else if (position==3) {
                    //YoreselTatlilar
                    startActivity(new Intent(MainActivity.this,YoreselTatlilar.class));

                }


            }
        });

    }
}