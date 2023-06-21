package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class kadayif_sby extends AppCompatActivity {
    TextView kadayif_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kadayif_sby);

        kadayif_sby=findViewById(R.id.kadayif_sby);
        kadayif_sby.setText("Tel Kadayıf\n" +
                "\n" +
                "Türk mutfağının popüler yemeklerinden olan tel kadayıf, Giresun yöresine ait olmasıyla bilinmektedir. Özellikle bayram günlerinde sıklıkla tercih edilen kadayıf, üzerine fındık dökülerek servis edilmektedir. Şerbet, antep fıstığı ve yufka ile hazırlanan kadayıf mutlaka denenmesi gereken yemekler arasındadır.");
    }
}