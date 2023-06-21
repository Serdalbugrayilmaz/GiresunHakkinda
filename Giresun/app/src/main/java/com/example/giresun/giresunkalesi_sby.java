package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class giresunkalesi_sby extends AppCompatActivity {
    TextView giresunkalesi_sby;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giresunkalesi_sby);

        giresunkalesi_sby = findViewById(R.id.giresunkalesi_sby);
        giresunkalesi_sby.setText("Giresun Kalesi, Giresun ilinde MÖ 2. yüzyılda inşa edilmiş kaledir.\n" +
                "\n" +
                "\n" +
                "Giresun Kalesi.\n" +
                "Giresun Kalesi kentin kuzeyindeki yarım adanın kente hakim tepesi üzerinde yer almaktadır. Kalenin günümüze kadar gelebilen kalıntıları merkez kule ve ona bağlı güneydeki sur duvarlarıdır. Sur duvarlarının tabanındaki dikdörtgen büyük blok taşlardan yapılmış bölümü, surların ve kalenin Helenistik ve Roma Dönemi'ne kadar gittiği izlenimini vermektedir.\n" +
                "\n" +
                "Antik kaynaklarda \"Bronz Duvarlı Kale\" olarak anlatılan Giresun kalesi, muhtemelen Pontus Kralı I. Farnekes zamanında yapılmıştır. Trabzon İmparatorluğu'nun 1300'lü yıllarda Türklere karşı en son sınır kalelerinden birisidir. Bu nedenle 1301 yıllarında Trabzon İmparatoru II. Aleksios tarafından tamir ettirilmiştir. Kalenin denize hakim oluşu ve ticaret yollarının birleştiği noktada bulunuşu kıyı kontrollü amaçlı askeri bir yapı olduğunu göstermektedir. Kalenin en yüksek mevkisinde Topal Osman'ın mezarı, denize bakan kuzey yamacında ise şehitlik ve Hacı Bektaşi Veli'nin müridi Kurban Dede'nin türbesi bulunmaktadır.");



    }
}