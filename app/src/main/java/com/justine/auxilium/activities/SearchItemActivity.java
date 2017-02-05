package com.justine.auxilium.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.justine.auxilium.R;

public class SearchItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);
    }
    public void goToActivity5(View view){
        Intent intent = new Intent (this, SearchCarActivity.class);
        startActivity(intent);
    }
    public void goToActivity6(View view){
        Intent intent = new Intent (this, LandSearchActivity.class);
        startActivity(intent);
    }

}
