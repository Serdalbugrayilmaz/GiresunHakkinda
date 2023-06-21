package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class turbe_sby extends AppCompatActivity {
    TextView turbe_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turbe_sby);

        turbe_sby= findViewById(R.id.turbe_sby);
        turbe_sby.setText("Seyyid Vakkas Türbesi - Giresun\n" +
                "Fatih Sultan Mehmet’in uç beylerindendir. Osmanlı ordularına  Giresun’un fethi kapılarını açma uğraşlarını verirken şehit olmuş ve şehit olduğu yerde toprağa verilmiştir. Rizeli Mehmet Ali Bey tarafından 1888 yılında, o zamanlardaki ahşap ziyaretgahın yerine 19'uncu yüzyıl Osmanlı mimarisinin tipik bir Kümbet özelliğini taşıyan türbesi inşa edilmiştir. Giresun Seyyit Vakkas Türbesi, sekizgen gövdeli ve kubbeli yapıdır. Söz konusu türbenin, arşiv kayıtlarında projeleri mevcuttur. Şehir merkezindedir ve yerli, yabancı ziyaretçiler ile bölge halkı tarafından sık sık ziyaret edilmektedir.");

    }
}