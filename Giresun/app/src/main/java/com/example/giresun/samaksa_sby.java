package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class samaksa_sby extends AppCompatActivity {
    TextView samaksa_sby;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samaksa_sby);

        samaksa_sby=findViewById(R.id.samaksa_sby);
        samaksa_sby.setText("Samaksa\n" +
                "\n" +
                "Samaksa tatlısı, Giresun yöresinde yapılan sütlü tatlıdır. Çok lezzetli olan bu muhallebiyi sizler de buraya geldiğiniz zaman denemeye başlayabilirsiniz. Fakat bu muhallebiyi, diğer muhallebilerle eş tutmamanız gerekiyor. Çünkü bu muhallebinin rengi beyaz değil, kırmızıdır. Kırmızı rengiyle büyüleyen tatlıyı yemek için sabırsızlanmaya başlayabilirsiniz. Tatlının kırmızı bir renk almasının nedeni ise, kırmızı üzümden yapılmış olmasıdır.\n" +
                "\n" +
                "Samaksa tatlının içerisinde kırmızı üzümün haricinde mısır yarması ve unla hazırlanarak yapılan bir tatlıdır. En son olarak soğuk süt konularak muhallebi hazırlanır. Muhallebinin mayhoş bir tadı olmasından dolayı, ağzınızda hoş bir tat bırakıyor. Yoğun bir şeker tadı bırakmayarak, baymıyor.\n" +
                "\n" +
                "Hafif ekşi ve tatlının bir araya geldiği muhallebiyi denemek isteyenler için ideal seçeneklerden biri oluyor.");
    }
}