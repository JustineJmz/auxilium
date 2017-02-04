package com.example.justine.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
   EditText editID,editYear,editPrice,editBrand,editOwner,editMobile,editRemarks;
    ImageButton imSave;
    Spinner spFuel;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editID=(EditText)findViewById(R.id.editID);
        editYear=(EditText)findViewById(R.id.editYear);
        editPrice=(EditText)findViewById(R.id.editPrice);
        editBrand=(EditText)findViewById(R.id.editBrand);
        editOwner=(EditText)findViewById(R.id.editOwner);
        editMobile=(EditText)findViewById(R.id.editMobile);
        editRemarks=(EditText)findViewById(R.id.editRemarks);
        imSave=(ImageButton)findViewById(R.id.imSave);
        spFuel=(Spinner)findViewById(R.id.spFuel);
        db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(ID int,Reg_no VARCHAR,Year VARCHAR,Manufaturer VARCHAR,Model VARCHAR,Price  VARCHAR,Colour  VARCHAR,Capacity  VARCHAR,K/m_used  VARCHAR,Name_owner  VARCHAR,Mobile_no  VARCHAR,CC  VARCHAR,Photo  VARCHAR,Fuel  VARCHAR,Remarks  VARCHAR,status  VARCHAR,Sale_info  VARCHAR);");
    }
    public void goToActivity2 (View view){
        Intent intent = new Intent (this, search_item.class);
        startActivity(intent);
    }
    public void goToActivity3 (View view){
        Intent intent = new Intent (this, select_add.class);
        startActivity(intent);
    }
}


