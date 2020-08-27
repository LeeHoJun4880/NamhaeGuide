package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HotelListActivity extends AppCompatActivity {

    ArrayList<HotelModel> hotelModels;
    ListView lv_hotellist;
    HotelAdapter hotelAdapter;
    InputStream filename;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotellist);

        lv_hotellist = findViewById(R.id.lv_hotellist);


        try{
            filename = getAssets().open("namhaehotel.json");
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
        try{
            HotelAsync hotelAsync = new HotelAsync(HotelListActivity.this, filename);
            Object obj = hotelAsync.execute().get();
            hotelModels = (ArrayList<HotelModel>) obj;
            hotelAdapter = new HotelAdapter(HotelListActivity.this,R.layout.hotel_layout,hotelModels);

            lv_hotellist.setAdapter(hotelAdapter);



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
