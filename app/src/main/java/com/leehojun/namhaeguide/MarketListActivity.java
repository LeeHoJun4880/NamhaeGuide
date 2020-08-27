package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MarketListActivity extends AppCompatActivity {

    ArrayList<MarketModel> marketModels;
    ListView lv_marketlist;
    MarketAdapter marketAdapter;
    InputStream filename;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketlist);

        lv_marketlist = findViewById(R.id.lv_marketlist);

        try{
            filename = getAssets().open("namhaemarket.json");
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
            MarketAsnyc marketAsnyc = new MarketAsnyc(MarketListActivity.this,filename);
            Object obj = marketAsnyc.execute().get();
            marketModels = (ArrayList<MarketModel>) obj;
            marketAdapter= new MarketAdapter(MarketListActivity.this,R.layout.market_layout,marketModels);

            lv_marketlist.setAdapter(marketAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
