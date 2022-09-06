package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardMuffins extends AppCompatActivity {
    ImageView applemuffin6,bananamuffin6,blueberrymuffin6,chunkmuffins6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_muffins);

        applemuffin6 = (ImageView) findViewById(R.id.applemuffin6);
        applemuffin6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardMuffins.this, AppleMuffins.class);
                startActivity(intent);
            }
        });
        bananamuffin6 = (ImageView) findViewById(R.id.bananamuffin6);
        bananamuffin6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardMuffins.this, BananaMuffins.class);
                startActivity(intent);
            }
        });
        blueberrymuffin6 = (ImageView) findViewById(R.id.blueberrymuffin6);
        blueberrymuffin6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardMuffins.this, BlueberryMuffins.class);
                startActivity(intent);
            }
        });
        chunkmuffins6 = (ImageView) findViewById(R.id.chunkmuffins6);
        chunkmuffins6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardMuffins.this, ChunkMuffins.class);
                startActivity(intent);
            }
        });
    }
}