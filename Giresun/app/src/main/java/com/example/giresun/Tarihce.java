package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Tarihce extends AppCompatActivity {

    TextView textView;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihce);
        textView = findViewById(R.id.tarihce_sby);
        textView.setText("Giresun, 1397 yılında Türkmen beyi Emir Oğlu Süleyman Bey tarafından fethedilerek Türk yurdu haline getirilmiş olup, Eski Türklerde adı Vilayet-i Çepni'dir. Vilayet-i Çepni güneyde Gümüşhane/Koyulhisar, Gürgentepe; doğuda Beşikdüzü Abdal Musa (Sis) dağının etekleri, Kürtün hattı iç kesimlere yayılan bölgedir. Türkmen boylarından olan Çepnilerin buraya Horasan'dan tarihi İpek Yolu'nun Gümüşhane, Kürtün civarındaki gümüş madenlerinin ve limanların güvenliğini sağlamak üzere gönderilmiş olabileceği belirtilmektedir.\n" +
                "\n" +
                "Giresun Çepnileri makamı Güvendi yaylasında bulunan Güvenç Abdal'ın müridleriydiler. Giresun merkezi, 1397 yılından bu yana düşman işgali görmemiştir.");




    }
}