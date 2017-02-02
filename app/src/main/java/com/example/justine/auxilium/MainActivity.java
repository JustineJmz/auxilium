package com.example.justine.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity1 (View view){
        Intent intent = new Intent (this, search_item.class);
        startActivity(intent);
    }
    public void goToActivity2 (View view){
        Intent intent = new Intent (this, select_add.class);
        startActivity(intent);
    }

}


