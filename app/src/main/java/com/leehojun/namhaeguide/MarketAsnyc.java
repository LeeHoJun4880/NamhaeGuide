package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class MarketAsnyc extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<MarketModel> marketModels;
    InputStream filename = null;

    public MarketAsnyc(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.marketModels = new ArrayList<MarketModel>();
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

        return marketModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            marketModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String name = jsonObject.getString("시장명");
                String type = jsonObject.getString("시장유형");
                String address1 = jsonObject.getString("소재지도로명주소");
                String address2 = jsonObject.getString("소재지지번주소");
                String openperiod = jsonObject.getString("시장개설주기");
                Double lat = jsonObject.getDouble("위도");
                Double lng = jsonObject.getDouble("경도");
                int marketcount = jsonObject.getInt("점포수");
                String productkinds = jsonObject.getString("취급품목");
                String giftcard = jsonObject.getString("사용가능상품권");
                String webpage = jsonObject.getString("홈페이지주소");
                String toilet = jsonObject.getString("공중화장실보유여부");
                String parkingplace = jsonObject.getString("주차장보유여부");
                String openyear = jsonObject.getString("개설년도");
                String tel = jsonObject.getString("전화번호");

                MarketModel marketModel = new MarketModel(name, type, address1, address2, openperiod, lat, lng, marketcount,
                        productkinds, giftcard, webpage, toilet, parkingplace, openyear, tel);
                marketModels.add(marketModel);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
