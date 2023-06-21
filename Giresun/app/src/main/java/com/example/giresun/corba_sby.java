package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class corba_sby extends AppCompatActivity {
    TextView corba_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corba_sby);

        corba_sby=findViewById(R.id.corba_sby);
        corba_sby.setText("Karalahana Çorbası\n" +
                "\n" +
                "Giresun mutfağında çorbaların da ayrı bir yer edinmiş olduğunu söyleyebiliriz.  Burada tadabileceğiniz çok farklı çorba çeşitleri mevcut.  Böylece her gün alışılagelmiş mercimek, yayla çorbalarının yerine yöresel tadı içerisinde barındıran çeşitli çorba tariflerini de deneyimleyebileceksiniz. Biraz daha damağınızın alışık olmayacağı tatları denemek size fazlasıyla heyecan verecektir. Bu çorbalardan biri ise karalahana çorbası olduğunu belirtebiliriz.\n" +
                "\n" +
                "Karalahana çorbasının en önemli püf noktalarından biri içerisinde yer alacak karalahanadır. Karadeniz mutfaklarının vazgeçilmezlerinden biri olarak, Karalahana ön planda gelmektedir. Son derece sağlıklı olmasından dolayı çorba olarak da yapılır. Sarmasının yanı sıra çorbası da yöre halkı tarafından sevilir.\n" +
                "\n" +
                "Lezzetinin yanı sıra insan sağlığına faydasının çok olmasıyla da bilinir.  İçerisinde yer alan malzemeler karalahana, kuru soğan, kuru fasulye, yarma, mısır unu, domates salçası olacaktır. İçerisinde birden farklı malzemeyi barındırmış olmasından dolayı oldukça lezzetlidir.");
    }
}