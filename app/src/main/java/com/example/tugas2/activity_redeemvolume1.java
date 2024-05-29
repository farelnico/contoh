package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class activity_redeemvolume1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeemvolume1);
    }

    public void keredeem2(View view) {
        Intent keredeem2 = new Intent(activity_redeemvolume1.this, activity_redeemvolume2.class);
        startActivity(keredeem2);

    }

    public void backtomenu(View view) {
        Intent backtomenu = new Intent(activity_redeemvolume1.this, MainActivitymainmenu.class);
        startActivity(backtomenu);

    }
}