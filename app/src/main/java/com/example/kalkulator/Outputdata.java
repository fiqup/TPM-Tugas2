package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Outputdata extends AppCompatActivity {
    TextView tv_nama, tv_nim, tv_ipk;
    String nama1, nim1, ipk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputdata);

        tv_nama = findViewById(R.id.nama1);
        tv_nim  = findViewById(R.id.nim1);
        tv_ipk  = findViewById(R.id.nilai);

        if (getIntent().getStringExtra("nama")!=null){
            nama1 =getIntent().getStringExtra("nama");
            tv_nama.setText("Nama =" + nama1);
        }

        if (getIntent().getStringExtra("nim")!= null){
            nim1 =getIntent().getStringExtra("nim");
            tv_nim.setText("NIM =" + nim1);
        }

        if (getIntent().getStringExtra("ipk")!= null){
            ipk1 =getIntent().getStringExtra("ipk");
            tv_ipk.setText("IPK =" + ipk1);
        }
    }
}