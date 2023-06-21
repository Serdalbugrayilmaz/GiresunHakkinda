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

public class YoreselTatlilar extends AppCompatActivity {

    ListView listView_sby1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoresel_tatlilar);

        ListView listView_tatlilar=findViewById(R.id.listView_Tatlilar);
        List<String> list_tatlilar = new ArrayList<>();
        list_tatlilar.add("Fındıklı Güllaç");
        list_tatlilar.add("Tel Kadayıf");
        list_tatlilar.add("Samaksa");

        ArrayAdapter adapter_sby1=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list_tatlilar);
        listView_tatlilar.setAdapter(adapter_sby1);

        listView_tatlilar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //Fındıklı Güllaç
                    startActivity(new Intent(YoreselTatlilar.this,findikligullac_sby.class));
                } else if (position==1) {
                    //Tel Kafayıf
                    startActivity(new Intent(YoreselTatlilar.this,kadayif_sby.class));
                } else if (position==2) {
                    //Samaksa
                    startActivity(new Intent(YoreselTatlilar.this,samaksa_sby.class));
                }

            }
        });
    }
}