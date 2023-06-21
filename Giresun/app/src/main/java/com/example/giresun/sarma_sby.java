package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class sarma_sby extends AppCompatActivity {

    TextView sarma_sby;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarma_sby);

        sarma_sby=findViewById(R.id.sarma_Sby);
        sarma_sby.setText("Karalahana Sarması\n" +
                "\n" +
                "Karalahana sarmasını çok kez duymuş ama bir türlü yememiş olabilirsiniz. Giresun’un meşhur sarmalarından biridir. Sarma hazırlanışında, ince olmasına dikkat ediliyor. Böylece kalem gibi hazırlanan karalahana sarmaların içerisine pirinç, bulgur, salça, baharat giriyor.\n" +
                "\n" +
                "Ülkemizin farklı kesimlerinde yaprak sarması ağırlıklı şekilde yapılıyor.  Fakat bu yörelerde yaprak sarması yerine karalahana kullanılıyor. Karalahanadan yapılan tarif, oldukça lezzetlidir. Farklı şehirlerden buraya gelenler, ilk olarak karalahana sarmasını denemek istiyor. Çünkü bu tür sarmalar, çok fazla sevilmektedir.\n" +
                "\n" +
                "Karalahana sarmasının lezzetli olması için içerisine girecek olan malzemelerin neler olduğu da önemlidir. Bu yüzden dolayıdır ki mutlaka doğru malzeme seçimine yer verilmesi gerekmektedir. Oldukça güzel bir tarif olmasından dolayı bayılarak yiyeceksiniz.");

    }
}