package com.fitriasari.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText angka1edittext;
    private EditText angka2edittext;
    private TextView hasilTextView;
    private Button btnbersihkan,plus,minus,kali,bagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1edittext = findViewById(R.id.angka1edittext);
        angka2edittext = findViewById(R.id.angka2edittext);
        hasilTextView = findViewById(R.id.hasilTextView);
        btnbersihkan = findViewById(R.id.btnbersihkan);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);

        btnbersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1edittext.setText("");
                angka2edittext.setText("");
                hasilTextView.setText("0");
                angka1edittext.requestFocus();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1edittext.getText().length()>0) && (angka2edittext.getText().length()>0)) {
                    int angka1 = Integer.parseInt(angka1edittext.getText().toString());
                    int angka2 = Integer.parseInt(angka2edittext.getText().toString());
                    int hasil = angka1 + angka2;
                    hasilTextView.setText(String.valueOf(hasil));
                }else {
                    Toast.makeText(MainActivity.this,"Mohon Masukkan Angka pertama & kedua ",Toast.LENGTH_LONG).show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1edittext.getText().length()>0) && (angka2edittext.getText().length()>0)) {
                    int angka1 = Integer.parseInt(angka1edittext.getText().toString());
                    int angka2 = Integer.parseInt(angka2edittext.getText().toString());
                    int hasil = angka1 - angka2;
                    hasilTextView.setText(String.valueOf(hasil));
                }else {
                    Toast.makeText(MainActivity.this,"Mohon Masukkan Angka pertama & kedua ",Toast.LENGTH_LONG).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1edittext.getText().length()>0) && (angka2edittext.getText().length()>0)) {
                    int angka1 = Integer.parseInt(angka1edittext.getText().toString());
                    int angka2 = Integer.parseInt(angka2edittext.getText().toString());
                    int hasil = angka1 * angka2;
                    hasilTextView.setText(String.valueOf(hasil));
                }else {
                    Toast.makeText(MainActivity.this,"Mohon Masukkan Angka pertama & kedua ",Toast.LENGTH_LONG).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1edittext.getText().length()>0) && (angka2edittext.getText().length()>0)) {
                    int angka1 = Integer.parseInt(angka1edittext.getText().toString());
                    int angka2 = Integer.parseInt(angka2edittext.getText().toString());
                    float hasil = (float) angka1 / angka2;
                    hasilTextView.setText(String.valueOf(hasil));
                }else {
                    Toast.makeText(MainActivity.this,"Mohon Masukkan Angka pertama & kedua ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}