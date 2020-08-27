package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ToiletListActivity extends AppCompatActivity {

    ArrayList<ToiletModel> toiletModels;
    ListView lv_toiletlist;
    ToiletAdapter toiletAdapter;
    InputStream filename;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publictoiletlist);

        lv_toiletlist = findViewById(R.id.lv_toiletlist);

        try {
            filename = getAssets().open("namhaetoilet.json");
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
            ToiletAsnyc toiletAsnyc = new ToiletAsnyc(ToiletListActivity.this,filename);
            Object obj = toiletAsnyc.execute().get();
            toiletModels = (ArrayList<ToiletModel>) obj;
            toiletAdapter = new ToiletAdapter(ToiletListActivity.this,R.layout.toilet_layout,toiletModels);

            lv_toiletlist.setAdapter(toiletAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
