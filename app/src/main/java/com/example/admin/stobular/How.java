package com.example.admin.stobular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class How extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how);

    }

    public void info (View o) {

        Intent intent = new Intent(this, home.class);

        startActivity(intent);

    }
}
