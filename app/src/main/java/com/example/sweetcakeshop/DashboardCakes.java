package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardCakes extends AppCompatActivity {
    ImageView black1,fondant1,fruit1,rainbow1,jarcake1,heartcake1,icecreamcake1,swissrollcake1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_cakes);

        black1 = (ImageView) findViewById(R.id.black1);
        black1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, BlackforestCake.class);
                startActivity(intent);
            }
        });
        fondant1 = (ImageView) findViewById(R.id.fondant1);
        fondant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this,FondantCake.class);
                startActivity(intent);
            }
        });
        fruit1 = (ImageView) findViewById(R.id.fruit1);
        fruit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, FruitCake.class);
                startActivity(intent);
            }
        });
        rainbow1 = (ImageView) findViewById(R.id.rainbow1);
        rainbow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, RainbowCake.class);
                startActivity(intent);
            }
        });
        jarcake1 = (ImageView) findViewById(R.id.jarcake1);
        jarcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, JarCake.class);
                startActivity(intent);
            }
        });
        heartcake1 = (ImageView) findViewById(R.id.heartcake1);
        heartcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, HeartCake.class);
                startActivity(intent);
            }
        });
        icecreamcake1 = (ImageView) findViewById(R.id.icecreamcake1);
        icecreamcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, IcecreamCake.class);
                startActivity(intent);
            }
        });
        swissrollcake1 = (ImageView) findViewById(R.id.swissrollcake1);
        swissrollcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCakes.this, SwissrollCake.class);
                startActivity(intent);
            }
        });

    }
}