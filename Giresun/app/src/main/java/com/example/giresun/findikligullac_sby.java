package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class findikligullac_sby extends AppCompatActivity {
    TextView findiligullac_Sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findikligullac_sby);

        findiligullac_Sby = findViewById(R.id.findikligullac_sby);
        findiligullac_Sby.setText("Fındıklı Güllaç\n" +
                "\n" +
                "Bol sütlü tatlıları sevenler için harika bir lezzet diyebiliriz. Fındıklı Güllaç, yalnızca Ramazan aylarında tüketilmiyor.  Ramazan aylarının dışında normalde de yapılarak, tüketilen bir tatlıdır. Fakat Ramazan ayı geldiğinde olmazsa olmazlar arasına giren bir tatlı olarak karşımıza çıkıyor. Güllaç tatlısının üzerine eklenen çekilmiş fındık, tatlının lezzetini daha fazla arttırmayı sağlıyor.\n" +
                "\n" +
                "Güllaç tatlısı, birçok şehirde yapılan tatlılardan biridir. O şehirlerden biri Giresun olurken, tatlı yapımı sırasında başvurulan malzeme ve doğru teknikler tatlının daha fazla lezzetlenmesine yardımcı oluyor. Fındık, vanilya ve güllaç yaprağın bir araya gelerek hazırlanması sonucuyla ortaya enfes bir tatlı çıkartılmış oluyor.\n" +
                "\n" +
                "Sütlü tatlı sevenlerden biriyseniz, halkın en çok sevdiği ve yaptığı tatlılardan biri olan fındıklı güllacını denemelisiniz. Birçok restoranda yemeklerden sonra hafif tatlı olarak tercih edebileceğiniz bu tatlı ile birlikte damağınızda çok önemli bir lezzet de bırakabilirsiniz.");
    }
}