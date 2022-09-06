package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardDonut extends AppCompatActivity {
    ImageView cakedonut3,boastan3,dunkin3,holes3,krime3,yeast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_donut);

        cakedonut3 = (ImageView) findViewById(R.id.cakedonut3);
        cakedonut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, CakeDonut.class);
                startActivity(intent);
            }
        });
        boastan3 = (ImageView) findViewById(R.id.boastan3);
        boastan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, BoastanDonut.class);
                startActivity(intent);
            }
        });
        dunkin3 = (ImageView) findViewById(R.id.dunkin3);
        dunkin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, DunkinDonut.class);
                startActivity(intent);
            }
        });
        holes3 = (ImageView) findViewById(R.id.holes3);
        holes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, HolesDonut.class);
                startActivity(intent);
            }
        });
        krime3 = (ImageView) findViewById(R.id.krime3);
        krime3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, KrimeDonut.class);
                startActivity(intent);
            }
        });
        yeast3 = (ImageView) findViewById(R.id.yeast3);
        yeast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardDonut.this, YeastDonut.class);
                startActivity(intent);
            }
        });
    }
}