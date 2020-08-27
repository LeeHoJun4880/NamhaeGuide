package com.leehojun.namhaeguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_main, btn_map, btn_person, btn_officelist,
            btn_trafficlist, btn_hospitallist, btn_marketlist, btn_parkingplacelist,
            btn_publictoiletlist, btn_hotellist, btn_festivallist, btn_foodstorelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectButton();
    }

    private void connectButton(){
        btn_main = findViewById(R.id.btn_main);
        btn_map = findViewById(R.id.btn_map);
        btn_person = findViewById(R.id.btn_person);

        btn_officelist = findViewById(R.id.btn_officelist);
        btn_trafficlist = findViewById(R.id.btn_trafficlist);
        btn_hospitallist = findViewById(R.id.btn_hospitallist);
        btn_marketlist = findViewById(R.id.btn_marketlist);
        btn_foodstorelist = findViewById(R.id.btn_foodstorelist);
        btn_parkingplacelist = findViewById(R.id.btn_parkingplacelist);
        btn_publictoiletlist = findViewById(R.id.btn_publictoiletlist);
        btn_hotellist = findViewById(R.id.btn_hotellist);
        btn_festivallist = findViewById(R.id.btn_festivallist);


        btn_main.setOnClickListener(ClickListener);
        btn_map.setOnClickListener(ClickListener);
        btn_person.setOnClickListener(ClickListener);
        btn_officelist.setOnClickListener(ClickListener);
        btn_trafficlist.setOnClickListener(ClickListener);
        btn_hospitallist.setOnClickListener(ClickListener);
        btn_marketlist.setOnClickListener(ClickListener);
        btn_foodstorelist.setOnClickListener(ClickListener);
        btn_parkingplacelist.setOnClickListener(ClickListener);
        btn_publictoiletlist.setOnClickListener(ClickListener);
        btn_hotellist.setOnClickListener(ClickListener);
        btn_festivallist.setOnClickListener(ClickListener);

    }

    Button.OnClickListener ClickListener = new Button.OnClickListener() {
        Intent intent = null;
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_main:
                    intent = new Intent(MainActivity.this,MainActivity.class);
                    break;
                case R.id.btn_map:
                    intent = new Intent(MainActivity.this,NamhaeMapActivity.class);
                    break;
                case R.id.btn_person:
                    intent = new Intent(MainActivity.this,NamhaePersonActivity.class);
                    break;
                case R.id.btn_officelist:
                    intent = new Intent(MainActivity.this,OfficeListActivity.class);
                    break;
                case R.id.btn_trafficlist:
                    intent = new Intent(MainActivity.this,TrafficListActivity.class);
                    break;
                case R.id.btn_hospitallist:
                    intent = new Intent(MainActivity.this,HospitalListActivity.class);
                    break;
                case R.id.btn_marketlist:
                    intent = new Intent(MainActivity.this,MarketListActivity.class);
                    break;
                case R.id.btn_foodstorelist:
                    intent = new Intent(MainActivity.this,FoodStoreListActivity.class);
                    break;
                case R.id.btn_parkingplacelist:
                    intent = new Intent(MainActivity.this,ParkingPlaceListActivity.class);
                    break;
                case R.id.btn_publictoiletlist:
                    intent = new Intent(MainActivity.this, ToiletListActivity.class);
                    break;
                case R.id.btn_hotellist:
                    intent = new Intent(MainActivity.this,HotelListActivity.class);
                    break;
                case R.id.btn_festivallist:
                    intent = new Intent(MainActivity.this,FestivalListActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
