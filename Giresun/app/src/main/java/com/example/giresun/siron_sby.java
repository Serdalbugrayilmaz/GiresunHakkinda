package com.example.giresun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class siron_sby extends AppCompatActivity {

    TextView siron_sby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siron_sby);

        siron_sby=findViewById(R.id.siron_sby);
        siron_sby.setText("Siron\n" +
                "\n" +
                "Ülkemizde sık sık yapılan bu yemeğin tescili ise Giresun’a aittir. Oldukça güzel ve lezzetli diyebileceğimiz bir yemek türüdür. Siron yemeğinin püf noktalarından biri, kurutulmuş hamurun olmasıdır. Yöre halkının çok sevdiği ve sürekli olarak yaptığı bir yemektir. Daha ağırlıklı olarak ise Ramazan ayında tercih edilen bir tariftir. Ramazan ayının iftar sofralarının bakıldığı zaman olmazsa olmazlarından biri haline gelen tariftir.\n" +
                "\n" +
                "Siron yemeğini daha önce hiç yememiş olanlar, mutlaka buraya geldikleri an bu lezzeti deneyimlemeliler. Siron yemeğinde yer alan malzemelerin neler olduğunu, ilk kez deneyimleyecek olanlar merak edecektir. Siron yemeğinde hamurun haricinde bir de iç harç hazırlanıyor. Yemeğin iç harcında ise lezzetlendirmeyi başaracak olan kıyma, karabiber, tuz, tereyağı ve yufka gibi tariflerde bulunuyor.\n" +
                "\n" +
                "Yemeğin daha da fazla nefis hale dönüşmesi içinde en son olarak ise üzerine tereyağlı bir sos hazırlanır. Yemeğin tüm aşamaları bittikten sonra ise ortaya oldukça lezzetli bir yemek çıkmaya başlamış olacaktır.");
    }
}