package com.example.idents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView sub_nama

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sub_nama = findViewById(R.id.tv_nama);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        if (TextUtils.isEmpty(nama))    {
            sub_nama.setText("Nama :");
        } else {
            sub_nama.setText("Nama :" + nama);
        }
}