package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hamsilipilav_sby extends AppCompatActivity {

    TextView hamsilipilav_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamsilipilav_sby);

        hamsilipilav_sby = findViewById(R.id.hamsilipilav_sby);
        hamsilipilav_sby.setText("Hamsili Pilav\n" +
                "\n" +
                "Doğu Karadeniz mutfağının eşsiz lezzletlerinden biri olan hamsili pilav, Giresun’da da yöresel olarak servis edilmektedir. Hem içerdiği besin değeri açısından hem de lezzetiyle ön plana çıkan hamsili pilav, özellikle Giresun Limanı’nda yer alan balıkçılarda deneyimlenmesi gereken yemekler arasındadır.");


    }
}