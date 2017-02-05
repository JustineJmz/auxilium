package com.justine.auxilium.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.justine.auxilium.R;

public class SearchItemActivity extends BaseActivity {

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
        Intent intent = new Intent (this, SearchLandActivity.class);
        startActivity(intent);
    }

}
