package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class OfficeListActivity extends AppCompatActivity {

    ArrayList<OfficeModel> officeModels;
    ListView lv_officelist;
    OfficeAdapter officeAdapter;
    InputStream filename;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officelist);

        lv_officelist = findViewById(R.id.lv_officelist);

        try {
            filename = getAssets().open("namhaeoffices.json");
        } catch (IOException e) {
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
            OfficeAsync officeAsync = new OfficeAsync(OfficeListActivity.this,filename);
            Object obj = officeAsync.execute().get();
            officeModels = (ArrayList<OfficeModel>) obj;
            officeAdapter = new OfficeAdapter(OfficeListActivity.this,R.layout.office_layout,officeModels);

            lv_officelist.setAdapter(officeAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
