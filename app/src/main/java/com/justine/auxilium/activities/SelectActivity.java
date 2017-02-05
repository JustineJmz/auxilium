package com.justine.auxilium.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.justine.auxilium.R;
import com.example.justine.auxilium.activities.AddCarActivity;
import com.example.justine.auxilium.activities.AddLandActivity;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_add);
    }

    public void goToActivity3 (View view){
        Intent intent = new Intent (this, AddCarActivity.class);
        startActivity(intent);
    }
    public void goToActivity4 (View view){
        Intent intent = new Intent (this, AddLandActivity.class);
        startActivity(intent);
    }

}
