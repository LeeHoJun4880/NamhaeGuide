package com.leehojun.namhaeguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class FoodStoreListActivity extends AppCompatActivity {

    ArrayList<FoodstoreModel> foodstoreModels;
    ListView lv_foodstorelist;
    FoodStoreAdapter foodStoreAdapter;
    InputStream filename;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodstorelist);

        lv_foodstorelist = findViewById(R.id.lv_foodstorelist);

        try{
            filename = getAssets().open("namhaefoodstore.json");
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
            FoodStoreAsync foodStoreAsync = new FoodStoreAsync(FoodStoreListActivity.this,filename);
            Object obj = foodStoreAsync.execute().get();
            foodstoreModels = (ArrayList<FoodstoreModel>) obj;
            foodStoreAdapter = new FoodStoreAdapter(FoodStoreListActivity.this,R.layout.foodstore_layout,foodstoreModels);

            lv_foodstorelist.setAdapter(foodStoreAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
