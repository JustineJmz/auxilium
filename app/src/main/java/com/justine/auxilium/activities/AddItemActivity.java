package com.justine.auxilium.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.justine.auxilium.R;

public class AddItemActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
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
