package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class giresunmuzesi_sby extends AppCompatActivity {

    TextView giresunmuzesi_sby;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giresunmuzesi_sby);
        giresunmuzesi_sby=findViewById(R.id.giresunmuzesi_sby);
        giresunmuzesi_sby.setText("Giresun Müzesi - Giresun\n" +
                "\n" +
                "Giresun Müzesi, eski adı Gogora Mahallesi olan Zeytinlik Mevkii'nde yer alır. Yapı eski kaynaklarda Aziz Nikola Kilisesi olarak geçmektedir. Kilise bir avlu içerisinde yer almaktadır ve doğu-batı doğrultusunda dikdörtgen planlıdır. Kilisenin ana girişi batıdan olmakla birlikte kuzey ve güneyden tali girişleri vardır. Ana kapının iki yanı kabartma sütun profiliyle ve alın kısmı burma sütunce ile bezenmiştir. Üzerinde on iki pencereli kasnaklı kubbesi bulunan kilisenin naosu (bir tapınakta kült heykelinin korunduğu en kutsal mekâna verilen ad), iki sıra sütun ile üç nefe (yapılarda sütunlarla ya da payelerle ayrılan her bir bölüm) ayrılmıştır. Orta nef yan neflerden daha geniştir ve her nefin ucunda bir apsis (kiliselerde koronun arkasında bulunan, tonoz ya da kubbe ile örtülü bölüm, kavisli duvar) bulunur. Üçlü apsis içeride dairesel dışarıdan ise beşgen plana sahiptir. Orta apsis yan apsislerden daha geniş ve yüksektir. Neflerin üzeri tonoz ile kaplanmıştır. Kilisenin kuzey yanında “Papaz Evi” olarak anılan yapı, kalıntılarından yola çıkarak 1990’lı yıllarda yeniden inşa edilmiştir. Papaz Evi'nin batı duvarına bitişik, birbirine paralel uzanan iki adet mahzen vardır. Beşik tonozlu olan mahzenler günümüzde sergi salonu olarak kullanılmaktadır. Kilisenin güney ve Papaz Evi'nin batı cephesinde iki adet çeşme bulunmaktadır.");
    }
}