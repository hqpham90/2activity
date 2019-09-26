package com.example.casestudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class HaiActivity extends AppCompatActivity {
    TextView tv_Ketqua;
    Button bt_thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);

        tv_Ketqua = (TextView)findViewById(R.id.txtv_ketqua);
    String hoten = getIntent().getExtras().getString( "ht");
       String namsinh = getIntent().getExtras().getString( "ns");
       String st= "";
        st += "Ho va ten:" + hoten;
        st += "Nam sinh" +namsinh;
        Calendar calendar =Calendar.getInstance();
        st += "\n Tuoi:" + ((calendar.getTime().getYear() +1900)- Integer.parseInt(namsinh));

        tv_Ketqua.setText(st);

        bt_thoat = (Button)findViewById(R.id.btn_thoat);
        bt_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
