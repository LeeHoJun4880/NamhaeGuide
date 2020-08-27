package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HospitalListActivity extends AppCompatActivity {

    ArrayList<HospitalModel> hospitalModels;
    ListView lv_hospitallist;
    HospitalAdapter hospitalAdapter;
    InputStream filename;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitallist);

        lv_hospitallist = findViewById(R.id.lv_hospitallist);

        try {
            filename = getAssets().open("namhaehospital.json");
        } catch (IOException e){
            e.printStackTrace();
        }

        connectGetData();
    }

    private void connectGetData(){
        try {
            HospitalAsync hospitalAsync = new HospitalAsync(HospitalListActivity.this,filename);
            Object obj = hospitalAsync.execute().get();
            hospitalModels = (ArrayList<HospitalModel>) obj;
            hospitalAdapter = new HospitalAdapter(HospitalListActivity.this,R.layout.hospital_layout,hospitalModels);

            lv_hospitallist.setAdapter(hospitalAdapter);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
