package com.justine.auxilium.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.justine.auxilium.R;

public class SearchCarActivity extends BaseActivity {
    Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_car);
        initializeUI();
    }

    void initializeUI() {
        buttonSearch = (Button) findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchCarActivity.this, DetailCarActivity.class);
                startActivity(intent);
            }
        });
    }
}
