package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardPastry extends AppCompatActivity {
    ImageView blackforest2,butterscotch2,chocolatetruffle2,chocochip2,coffee2,ferrero2,fruit2,kitkat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_pastry);

        blackforest2 = (ImageView) findViewById(R.id.blackforest2);
        blackforest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, BlackforestPastry.class);
                startActivity(intent);
            }
        });
        butterscotch2 = (ImageView) findViewById(R.id.butterscotch2);
        butterscotch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, ButterscotchPastry.class);
                startActivity(intent);
            }
        });
        chocolatetruffle2 = (ImageView) findViewById(R.id.chocolatetruffle2);
        chocolatetruffle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, TrufflePastry.class);
                startActivity(intent);
            }
        });
        chocochip2 = (ImageView) findViewById(R.id.chocochip2);
        chocochip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, ChocochipPastry.class);
                startActivity(intent);
            }
        });
        coffee2 = (ImageView) findViewById(R.id.coffee2);
        coffee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, CoffeePastry.class);
                startActivity(intent);
            }
        });
        ferrero2 = (ImageView) findViewById(R.id.ferrero2);
        ferrero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, FerreroPastry.class);
                startActivity(intent);
            }
        });
        fruit2 = (ImageView) findViewById(R.id.fruit2);
        fruit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, FruitPastry.class);
                startActivity(intent);
            }
        });
        kitkat2 = (ImageView) findViewById(R.id.kitkat2);
        kitkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPastry.this, KitkatPastry.class);
                startActivity(intent);
            }
        });
    }
}