package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class CartoonActivity extends AppCompatActivity {

    Button btn_cartoon01, btn_cartoon02, btn_cartoon03, btn_cartoon04, btn_cartoon05, btn_cartoon06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.cartoon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn_cartoon01 = (Button)findViewById(R.id.btn_cartoon01);
        btn_cartoon02 = (Button)findViewById(R.id.btn_cartoon02);
        btn_cartoon03 = (Button)findViewById(R.id.btn_cartoon03);
        btn_cartoon04 = (Button)findViewById(R.id.btn_cartoon04);
        btn_cartoon05 = (Button)findViewById(R.id.btn_cartoon05);
        btn_cartoon06 = (Button)findViewById(R.id.btn_cartoon06);
        btn_cartoon01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon01.class));
            }
        });
        btn_cartoon02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon02.class));
            }
        });
        btn_cartoon03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon03.class));
            }
        });
        btn_cartoon04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon04.class));
            }
        });
        btn_cartoon05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon05.class));
            }
        });
        btn_cartoon06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartoonActivity.this, Cartoon06.class));
            }
        });
    }
}