package com.example.justine.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class select_add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_add);
    }

    public void goToActivity3 (View view){
        Intent intent = new Intent (this, activity_add_car.class);
        startActivity(intent);
    }
    public void goToActivity4 (View view){
        Intent intent = new Intent (this, activity_land_add.class);
        startActivity(intent);
    }

}
