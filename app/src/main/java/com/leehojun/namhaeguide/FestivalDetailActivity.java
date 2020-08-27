package com.leehojun.namhaeguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class FestivalDetailActivity extends AppCompatActivity {

    String name, place, startdate, enddate, contents, hostagency, managementagency, sponsorship, webpage, address1, address2, datadate;
    Double lat,lng;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_festival);

        setText();
    }

    private void setText(){
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        place = intent.getStringExtra("place");
        startdate = intent.getStringExtra("startdate");
        enddate = intent.getStringExtra("enddate");
        contents = intent.getStringExtra("contents");
        hostagency = intent.getStringExtra("hostagency");
        managementagency = intent.getStringExtra("managementagency");
        sponsorship = intent.getStringExtra("sponsorship");
        webpage = intent.getStringExtra("webpage");
        address1 = intent.getStringExtra("address1");
        address2 = intent.getStringExtra("address2");
        datadate = intent.getStringExtra("datadate");
        lat = intent.getDoubleExtra("lat",0.000000);
        lng = intent.getDoubleExtra("lng",0.000000);

    }


}
