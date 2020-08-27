package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class ParkingplaceAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<ParkingplaceModel> parkingplaceModels;
    InputStream filename = null;


    public ParkingplaceAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.parkingplaceModels = new ArrayList<ParkingplaceModel>();
    }

    @Override
    protected Object doInBackground(Integer... integers) {

        String json = null;

        try {

            InputStream inputStream = filename;
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

            Parser(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return parkingplaceModels;
    }

    private void Parser(String s) {
        try {
            JSONArray jsonArray = new JSONArray(s);
            parkingplaceModels.clear();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String name = jsonObject.getString("주차장명");
                String division = jsonObject.getString("주차장구분");
                String type = jsonObject.getString("주차장유형");
                String address1 = jsonObject.getString("소재지도로명주소");
                String address2 = jsonObject.getString("소재지지번주소");
                int parkingdivision = jsonObject.getInt("주차구획수");
                String operatingday = jsonObject.getString("운영요일");
                String weekday_start_time = jsonObject.getString("평일운영시작시각");
                String weekday_end_time = jsonObject.getString("평일운영종료시각");
                String saturday_start_time = jsonObject.getString("토요일운영시작시각");
                String saturday_end_time = jsonObject.getString("토요일운영종료시각");
                String holiday_start_time = jsonObject.getString("공휴일운영시작시각");
                String holiday_end_time = jsonObject.getString("공휴일운영종료시각");
                String pricinginfo = jsonObject.getString("요금정보");
                String basictime = jsonObject.getString("주차기본시간");
                String basicprice = jsonObject.getString("주차기본요금");
                String plustime = jsonObject.getString("추가단위시간");
                String plusprice = jsonObject.getString("추가단위요금");
                String pricemethod = jsonObject.getString("결제방법");
                String uniqueness = jsonObject.getString("특기사항");
                String managementagency = jsonObject.getString("관리기관명");
                String tel = jsonObject.getString("전화번호");
                Double lat = jsonObject.getDouble("위도");
                Double lng = jsonObject.getDouble("경도");

                ParkingplaceModel parkingplaceModel = new ParkingplaceModel(name, division, type, address1, address2,
                        parkingdivision, operatingday, weekday_start_time, weekday_end_time, saturday_start_time, saturday_end_time,
                        holiday_start_time, holiday_end_time, pricinginfo, basictime, basicprice, plustime,
                        plusprice, pricemethod, uniqueness, managementagency, tel, lat, lng);
                parkingplaceModels.add(parkingplaceModel);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}