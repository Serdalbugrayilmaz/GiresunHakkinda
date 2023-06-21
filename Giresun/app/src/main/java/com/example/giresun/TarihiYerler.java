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

public class TarihiYerler extends AppCompatActivity {
    ListView listView_sby3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);

        ListView listView_yerler=findViewById(R.id.listView_TarihiYerler);
        List<String> list_yerler = new ArrayList<>();
        list_yerler.add("Giresun Kalesi");
        list_yerler.add("Giresun Müzesi");
        list_yerler.add("Seyyid Vakas Türbesi");
        list_yerler.add("Tirebolu Kalesi");

        ArrayAdapter adapter_sby3=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list_yerler);
        listView_yerler.setAdapter(adapter_sby3);

        listView_yerler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //Giresun Kalesi
                    startActivity(new Intent(TarihiYerler.this,giresunkalesi_sby.class));
                } else if (position==1) {
                    //Giresun Müzesi
                    startActivity(new Intent(TarihiYerler.this,giresunmuzesi_sby.class));

                } else if (position==2) {
                    //Seyyid Vakas Türbesi
                    startActivity(new Intent(TarihiYerler.this,turbe_sby.class));
                } else if (position==3) {
                    //Tirebolu Kalesi
                    startActivity(new Intent(TarihiYerler.this,tirebolukalesi_sby.class));
                }


            }
        });

    }
}