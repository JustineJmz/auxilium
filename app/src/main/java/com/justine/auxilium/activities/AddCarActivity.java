package com.justine.auxilium.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.justine.auxilium.R;
import com.justine.auxilium.models.Vehicle;

import io.realm.Realm;

public class AddCarActivity extends BaseActivity {
    EditText editTextKMUsed, editTextCapacity, editTextColor, editTextModelName, editTextRegisterNumber, editTextManufacturerYear, editTextRemarks, editTextMobileNumber, editTextOwnerName, editTextManufacturer, editTextFuel, editTextPrice;
    Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        initializeUI();
    }

    void initializeUI() {
        editTextModelName = (EditText) findViewById(R.id.editTextModelName);
        editTextRegisterNumber = (EditText) findViewById(R.id.editTextRegisterNumber);
        editTextManufacturerYear = (EditText) findViewById(R.id.editTextManufacturerYear);
        editTextRemarks = (EditText) findViewById(R.id.editTextRemarks);
        editTextMobileNumber = (EditText) findViewById(R.id.editTextMobileNumber);
        editTextOwnerName = (EditText) findViewById(R.id.editTextOwnerName);
        editTextManufacturer = (EditText) findViewById(R.id.editTextManufacturer);
        editTextFuel = (EditText) findViewById(R.id.editTextFuel);
        editTextCapacity = (EditText) findViewById(R.id.editTextCapacity);
        editTextPrice = (EditText) findViewById(R.id.editTextPrice);
        editTextKMUsed = (EditText) findViewById(R.id.editTextKMUsed);
        editTextColor = (EditText) findViewById(R.id.editTextColor);

        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSave();
            }

        });
    }

    private boolean doSave() {

        if (TextUtils.isEmpty(editTextManufacturerYear.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Year Of Manufacture empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextCapacity.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Capacity empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextKMUsed.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "KM Used empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextRegisterNumber.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "RegisterNumber empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextManufacturer.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Manufacturer empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextModelName.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "tModelName empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextColor.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "tColor empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextFuel.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Fuel empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextPrice.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Price empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextOwnerName.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "OwnerName empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextRemarks.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "Remarks empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(editTextMobileNumber.getText().toString())) {
            Toast.makeText(AddCarActivity.this, "MobileNumber empty", Toast.LENGTH_SHORT).show();
            return false;
        }


        final int capacity = Integer.parseInt(editTextCapacity.getText().toString());
        final int yearOfManufacture = Integer.parseInt(editTextManufacturerYear.getText().toString());
        final int kilometersUsed = Integer.parseInt(editTextKMUsed.getText().toString());
        final long price = Integer.parseInt(editTextPrice.getText().toString());

        final String registerNumber = editTextRegisterNumber.getText().toString();
        final String manufacturer = editTextManufacturer.getText().toString();
        final String modelName = editTextModelName.getText().toString();
        final String color = editTextColor.getText().toString();
        final String fuel = editTextFuel.getText().toString();
        final String ownerName = editTextOwnerName.getText().toString();
        final String contactNumber = editTextMobileNumber.getText().toString();
        final String remarks = editTextRemarks.getText().toString();


        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Number currentMaxId = realm.where(Vehicle.class).max("Id");
                long Id = ((currentMaxId == null) ? 0 : (currentMaxId.longValue() + 1));
                Vehicle vehicle = new Vehicle();
                vehicle.setId(Id);
                vehicle.setCapacity(capacity);
                vehicle.setYearOfManufacture(yearOfManufacture);
                vehicle.setKilometersUsed(kilometersUsed);
                vehicle.setRegisterNumber(registerNumber);
                vehicle.setManufacturer(manufacturer);
                vehicle.setModelName(modelName);
                vehicle.setColor(color);
                vehicle.setPrice(price);
                vehicle.setFuel(fuel);
                vehicle.setRemarks(remarks);
                vehicle.setContactNumber(contactNumber);
                vehicle.setOwnerName(ownerName);
                realm.copyToRealmOrUpdate(vehicle);
            }
        }, new Realm.Transaction.OnSuccess() {

            @Override
            public void onSuccess() {
                Toast.makeText(AddCarActivity.this, "Saved Item", Toast.LENGTH_SHORT).show();
            }
        });
        return true;
    }
}
