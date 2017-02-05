package com.justine.auxilium.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.justine.auxilium.R;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAddActivity(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

    public void openSearchActivity(View view) {
        Intent intent = new Intent(this, SearchItemActivity.class);
        startActivity(intent);
    }
}


