package com.example.sweetcakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardPies extends AppCompatActivity {
    ImageView applepie4,cheesepie4,cherrypie4,coconutpie4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_pies);

        applepie4 = (ImageView) findViewById(R.id.applepie4);
        applepie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPies.this, ApplePie.class);
                startActivity(intent);
            }
        });
        cheesepie4 = (ImageView) findViewById(R.id.cheesepie4);
        cheesepie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPies.this, CheesecakePie.class);
                startActivity(intent);
            }
        });
        cherrypie4 = (ImageView) findViewById(R.id.cherrypie4);
        cherrypie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPies.this, CherryPie.class);
                startActivity(intent);
            }
        });
        coconutpie4 = (ImageView) findViewById(R.id.coconutpie4);
        coconutpie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardPies.this, CoconutPie.class);
                startActivity(intent);
            }
        });
    }
}