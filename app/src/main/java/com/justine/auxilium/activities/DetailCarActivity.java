package com.justine.auxilium.activities;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TextView;

import com.justine.auxilium.R;
import com.justine.auxilium.models.Vehicle;

public class DetailCarActivity extends BaseActivity {
    TextView textViewKMUsed, textViewCapacity, textViewColor, textViewModelName, textViewRegisterNumber, textViewManufacturerYear, textViewRemarks, textViewMobileNumber, textViewOwnerName, textViewManufacturer, textViewFuel, textViewPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_car);
        initializeUI();

        /**Load last added. For now. pInne maatam*/
        Number currentMaxId = realm.where(Vehicle.class).max("Id");
        long Id = ((currentMaxId == null) ? 0 : (currentMaxId.longValue()));
        loadItem(Id);
    }

    private void loadItem(long id) {
        Vehicle thisVehicle = realm.where(Vehicle.class).equalTo("Id", id).findFirst();

        textViewModelName.setText(thisVehicle.getModelName());
        /**Notice this String.valueOf() its needed when a number is returned. You dont assign number in settext ok **/
        textViewRegisterNumber.setText(thisVehicle.getRegisterNumber());
        textViewManufacturerYear.setText(String.valueOf(thisVehicle.getYearOfManufacture()));
        textViewRemarks.setText(thisVehicle.getRemarks());
        textViewMobileNumber.setText(thisVehicle.getContactNumber());
        textViewOwnerName.setText(thisVehicle.getOwnerName());
        textViewManufacturer.setText(thisVehicle.getManufacturer());
        textViewFuel.setText(thisVehicle.getFuel());
        textViewCapacity.setText(String.valueOf(thisVehicle.getCapacity()));
        textViewPrice.setText(String.valueOf(thisVehicle.getPrice()));
        textViewKMUsed.setText(String.valueOf(thisVehicle.getKilometersUsed()));
        textViewColor.setText(thisVehicle.getColor());
    }

    void initializeUI() {
        textViewModelName = (TextView) findViewById(R.id.textViewModelName);
        textViewRegisterNumber = (TextView) findViewById(R.id.textViewRegisterNumber);
        textViewManufacturerYear = (TextView) findViewById(R.id.textViewManufacturerYear);
        textViewRemarks = (TextView) findViewById(R.id.textViewRemarks);
        textViewMobileNumber = (TextView) findViewById(R.id.textViewMobileNumber);
        textViewOwnerName = (TextView) findViewById(R.id.textViewOwnerName);
        textViewManufacturer = (TextView) findViewById(R.id.textViewManufacturer);
        textViewFuel = (TextView) findViewById(R.id.textViewFuel);
        textViewCapacity = (TextView) findViewById(R.id.textViewCapacity);
        textViewPrice = (TextView) findViewById(R.id.textViewPrice);
        textViewKMUsed = (TextView) findViewById(R.id.textViewKMUsed);
        textViewColor = (TextView) findViewById(R.id.textViewColor);
    }
}
