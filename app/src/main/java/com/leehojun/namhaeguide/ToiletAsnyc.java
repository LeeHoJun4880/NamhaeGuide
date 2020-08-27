package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class ToiletAsnyc extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<ToiletModel> toiletModels;
    InputStream filename = null;

    public ToiletAsnyc(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.toiletModels = new ArrayList<ToiletModel>();
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
        return toiletModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            toiletModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String type = jsonObject.getString("구분");
                String name = jsonObject.getString("화장실명");
                String address1 = jsonObject.getString("소재지도로명주소");
                String address2 = jsonObject.getString("소재지지번주소");
                String mantoilet = jsonObject.getString("남성용-대변기수");
                String manurinal = jsonObject.getString("남성용-소변기수");
                String mandisabledtoilet = jsonObject.getString("남성용-장애인용대변기수");
                String womantoilet = jsonObject.getString("여성용-대변기수");
                String womandisabledtoilet = jsonObject.getString("여성용-장애인용대변기수");
                String managementagency = jsonObject.getString("관리기관명");
                String tel = jsonObject.getString("전화번호");
                String openingtime = jsonObject.getString("개방시간");
                Double lat = jsonObject.getDouble("위도");
                Double lng = jsonObject.getDouble("경도");

                ToiletModel toiletModel = new ToiletModel(type, name, address1, address2, mantoilet, manurinal,
                        mandisabledtoilet, womantoilet, womandisabledtoilet, managementagency, tel, openingtime,
                        lat, lng);
                toiletModels.add(toiletModel);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
