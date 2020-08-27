package com.leehojun.namhaeguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class FestivalListActivity extends AppCompatActivity {

    ArrayList<FestivalModel> festivalModels;
    ListView lv_festivallist;
    FestivalAdapter festivalAdapter;
    InputStream filename;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivallist);

        lv_festivallist = findViewById(R.id.lv_festivallist);

        try {
            filename = getAssets().open("namhaefestival.json");
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
        try{
            FestivalAsync festivalAsync = new FestivalAsync(FestivalListActivity.this,filename);
            Object obj = festivalAsync.execute().get();
            festivalModels = (ArrayList<FestivalModel>) obj;
            festivalAdapter = new FestivalAdapter(FestivalListActivity.this,R.layout.festival_layout,festivalModels);

            lv_festivallist.setAdapter(festivalAdapter);
            lv_festivallist.setOnItemClickListener(onItemClickListener);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        Intent intent = null;
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            intent = new Intent(FestivalListActivity.this,FestivalDetailActivity.class);
            intent.putExtra("name",festivalModels.get(position).getName());
            intent.putExtra("place",festivalModels.get(position).getPlace());
            intent.putExtra("startdate",festivalModels.get(position).getStartdate());
            intent.putExtra("enddate",festivalModels.get(position).getEnddate());
            intent.putExtra("contents",festivalModels.get(position).getContents());
            intent.putExtra("hostagency",festivalModels.get(position).getHostagency());
            intent.putExtra("managementagency",festivalModels.get(position).getManagementagency());
            intent.putExtra("sponsorship",festivalModels.get(position).getSponsorship());
            intent.putExtra("webpage",festivalModels.get(position).getWebpage());
            intent.putExtra("address1",festivalModels.get(position).getAddress1());
            intent.putExtra("address2",festivalModels.get(position).getAddress2());
            intent.putExtra("lat",festivalModels.get(position).getLat());
            intent.putExtra("lng",festivalModels.get(position).getLng());
            intent.putExtra("datadate",festivalModels.get(position).getDatadate());
            startActivity(intent);
        }
    };
}
