package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, nim, ipk;
    Button submit;
    String nama1, nim1, ipk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.et_nama);
        nim = findViewById(R.id.et_nim);
        ipk = findViewById(R.id.et_ipk);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama1 = nama.getText().toString();
                nim1 = nim.getText().toString();
                ipk1 = ipk.getText().toString();
                double nilai = Double.parseDouble(ipk1);

                if (nilai >= 3.66 && nilai <= 4.00) {
                    ipk1 = "A";
                } else if (nilai >= 3.33 && nilai <= 3.66) {
                    ipk1 = "A-";
                } else if (nilai >= 3.00 && nilai <= 3.33) {
                    ipk1 = "B+";
                } else if (nilai >= 2.66 && nilai <= 3.00) {
                    ipk1 = "B";
                } else if (nilai >= 2.33 && nilai <= 2.66) {
                    ipk1 = "B-";
                } else if (nilai >= 2.00 && nilai <= 2.33) {
                    ipk1 = "C+";
                } else if (nilai >= 1.66 && nilai <= 2.00) {
                    ipk1 = "C";
                } else if (nilai >= 1.33 && nilai <= 1.66) {
                    ipk1 = "C-";
                } else if (nilai >= 1.00 && nilai <= 1.33) {
                    ipk1 = "D+";
                } else if (nilai >= 0 && nilai <= 1.00) {
                    ipk1 = "D";
                }

                Intent i = new Intent(MainActivity.this, Outputdata.class);

                if (nama1.equals("")|| nim1.equals("")||ipk1.equals("")){
                    Toast.makeText(MainActivity.this, "Nama, Nim, IPK tidak boleh kosong!", Toast.LENGTH_LONG).show();
                } else {
                    i.putExtra("nama", nama1);
                    i.putExtra("nim", nim1);
                    i.putExtra("ipk", ipk1);
                    startActivity(i);
                }
            }
        });

    }
}