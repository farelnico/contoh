package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class activity_redeemvolume2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeemvolume2);
    }

    public void backvolume1(View view) {
        Intent backvolume1 = new Intent(activity_redeemvolume2.this, activity_redeemvolume1.class);
        startActivity(backvolume1);

    }
}