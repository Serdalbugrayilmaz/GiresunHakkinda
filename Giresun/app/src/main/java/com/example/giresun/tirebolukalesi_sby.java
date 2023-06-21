package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tirebolukalesi_sby extends AppCompatActivity {

    TextView tirebolukalesi_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirebolukalesi_sby);
        tirebolukalesi_sby=findViewById(R.id.tirebolukalesi_sby);
        tirebolukalesi_sby.setText("Tirebolu Kalesi - Giresun\n" +
                "Tirebolu ilçe merkezinde bulunan tarihî Tirebolu Kalesi (Saint-Jean) ilçenin kuzeyinde deniz içerisindeki bir yarımada üzerinde yer alan küçük bir kaledir. Yarımadanın doğal yapısına uygun olarak inşa edilen kaleye güneyden dik bir merdivenle çıkılır. Kale moloz taş malzeme ile yığma olarak inşa edilmiştir. Giriş kente bakan basık kemerli bir açıklıktan sağlanır. Surları aralıklarla dışarıdan payandalarla desteklenmiştir. Kalenin içerisinde salnamelerde Meryem Ana Kilisesi olarak adlandırılan küçük bir şapel ile bir de mescit kalıntısı vardır. Kalede Osmanlı Dönemi'ne ait çok sayıda mezar taşı bulunmaktadır. Kale surları günümüze kadar sağlam gelebilmiştir. Daha önceki yıllarda geniş çaplı restorasyon ve onarım gören Tirebolu Kalesi, bölgenin en güzel tarihî eserlerinden biridir.");
    }
}