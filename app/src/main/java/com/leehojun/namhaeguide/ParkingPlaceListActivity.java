package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ParkingPlaceListActivity extends AppCompatActivity {

    ArrayList<ParkingplaceModel> parkingplaceModels;
    ListView lv_parkingplacelist;
    ParkingplaceAdapter parkingplaceAdapter;
    InputStream filename;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkingplacelist);

        lv_parkingplacelist = findViewById(R.id.lv_parkingplacelist);

        try{
            filename = getAssets().open("namhaeparkingplace.json");
        }catch (IOException e){
            e.printStackTrace();
        }

        connectGetData();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void connectGetData(){
        try {
            ParkingplaceAsync parkingplaceAsync = new ParkingplaceAsync(ParkingPlaceListActivity.this,filename);
            Object obj = parkingplaceAsync.execute().get();
            parkingplaceModels = (ArrayList<ParkingplaceModel>) obj;
            parkingplaceAdapter = new ParkingplaceAdapter(ParkingPlaceListActivity.this,R.layout.parkingplace_layout,parkingplaceModels);

            lv_parkingplacelist.setAdapter(parkingplaceAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
