package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivitymainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymainmenu);

        Button imageView35 = findViewById(R.id.imageView35);

        imageView35.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }
    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.hal_view);
        drawerLayout.openDrawer(GravityCompat.END);
    }

    public void scan(View view) {
        Intent scan = new Intent(MainActivitymainmenu.this, scan_tutupbotolaqua.class);
        startActivity(scan);

    }

    public void scan2(View view) {
        Intent scan2 = new Intent(MainActivitymainmenu.this, scan_tutupbotolaqua.class);
        startActivity(scan2);

    }

    public void redeemvaganza(View view) {
        Intent redeemvaganza = new Intent(MainActivitymainmenu.this, activity_redeemvolume1.class);
        startActivity(redeemvaganza);

    }

    public void extravaganza(View view) {
        Intent extravaganza = new Intent(MainActivitymainmenu.this, activity_selamat_undian.class);
        startActivity(extravaganza);

    }
}