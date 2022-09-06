package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardCookies extends AppCompatActivity {
    ImageView chocochip5,gingercookie5,molassescookie5,spritzcookie5,thumbprintcookie5,whoopiecookie5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_cookies);

        chocochip5 = (ImageView) findViewById(R.id.chocochip5);
        chocochip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, ChocochipCookies.class);
                startActivity(intent);
            }
        });
        gingercookie5 = (ImageView) findViewById(R.id.gingercookie5);
        gingercookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, GingerCookie.class);
                startActivity(intent);
            }
        });
        molassescookie5 = (ImageView) findViewById(R.id.molassescookie5);
        molassescookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, MolassesCookies.class);
                startActivity(intent);
            }
        });
        spritzcookie5 = (ImageView) findViewById(R.id.spritzcookie5);
        spritzcookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, SpritzCookies.class);
                startActivity(intent);
            }
        });
        thumbprintcookie5 = (ImageView) findViewById(R.id.thumbprintcookie5);
        thumbprintcookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, ThumbprintCookies.class);
                startActivity(intent);
            }
        });
        whoopiecookie5 = (ImageView) findViewById(R.id.whoopiecookie5);
        whoopiecookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardCookies.this, WhoopieCookies.class);
                startActivity(intent);
            }
        });
    }
}