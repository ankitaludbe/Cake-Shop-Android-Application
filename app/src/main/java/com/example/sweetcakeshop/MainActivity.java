package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView cake,pastry,donut,pies,cookies,muffins,imagemenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cake =(ImageView) findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DashboardCakes.class);
                startActivity(intent);
            }
        });
        pastry = (ImageView)findViewById(R.id.pastry);
        pastry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DashboardPastry.class);
                startActivity(intent);
            }
        });
        donut = (ImageView)findViewById(R.id.donut);
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardDonut.class);
                startActivity(intent);
            }
        });
        pies = (ImageView)findViewById(R.id.pies);
        pies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardPies.class);
                startActivity(intent);
            }
        });
        cookies = (ImageView)findViewById(R.id.cookies);
        cookies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardCookies.class);
                startActivity(intent);
            }
        });
        muffins = (ImageView)findViewById(R.id.muffins);
        muffins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardMuffins.class);
                startActivity(intent);
            }
        });
        imagemenu1 = (ImageView)findViewById(R.id.imagemenu1);
        imagemenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cart.class);
                startActivity(intent);
            }
        });


    }
}
