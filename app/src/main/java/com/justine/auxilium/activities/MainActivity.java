package com.justine.auxilium.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Spinner;

import com.justine.auxilium.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAddActivity(View view) {
        Intent intent = new Intent(this, SelectActivity.class);
        startActivity(intent);
    }

    public void openSearchActivity(View view) {
        Intent intent = new Intent(this, SearchItemActivity.class);
        startActivity(intent);
    }
}


