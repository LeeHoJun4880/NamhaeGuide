package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class HotelAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<HotelModel> hotelModels;
    InputStream filename;

    public HotelAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.hotelModels = new ArrayList<HotelModel>() ;
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

        return hotelModels;
    }

    private void Parser(String s){
        try {
            JSONArray jsonArray = new JSONArray(s);
            hotelModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String name = jsonObject.getString("업소명");
                String sectors = jsonObject.getString("업종명");
                String serviceobject = jsonObject.getString("서비스대상구분");
                String address1 = jsonObject.getString("소재지도로명주소");
                String address2 = jsonObject.getString("소재지지번주소");
                String tel = jsonObject.getString("전화번호");
                String numberofrooms = jsonObject.getString("객실수");
                String amenities = jsonObject.getString("부대시설");
                String parkinglotavailability = jsonObject.getString("주차장보유여부");
                String payment = jsonObject.getString("결제방법");
                String webpage = jsonObject.getString("홈페이지주소");
                String surrounding_tourism_information = jsonObject.getString("주변관광정보");
                Double lat = jsonObject.getDouble("위도");
                Double lng = jsonObject.getDouble("경도");

                HotelModel hotelModel = new HotelModel(name, sectors, serviceobject, address1, address2,
                        tel, numberofrooms, amenities, parkinglotavailability, payment, webpage,
                        surrounding_tourism_information, lat, lng);
                hotelModels.add(hotelModel);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
