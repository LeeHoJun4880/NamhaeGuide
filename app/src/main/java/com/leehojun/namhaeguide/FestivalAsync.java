package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class FestivalAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<FestivalModel> festivalModels;
    InputStream filename = null;

    public FestivalAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.festivalModels = new ArrayList<FestivalModel>();
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

        return festivalModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            festivalModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String name = jsonObject.getString("축제명");
                String place = jsonObject.getString("개최장소");
                String startdate = jsonObject.getString("축제시작일자");
                String enddate = jsonObject.getString("축제종료일자");
                String contents = jsonObject.getString("축제내용");
                String hostagency = jsonObject.getString("주관기관");
                String managementagency = jsonObject.getString("주최기관");
                String sponsorship = jsonObject.getString("후원기관");
                String webpage = jsonObject.getString("홈페이지주소");
                String address1 = jsonObject.getString("소재지도로명주소");
                String address2 = jsonObject.getString("소재지지번주소");
                Double lat = jsonObject.getDouble("위도");
                Double lng = jsonObject.getDouble("경도");
                String datadate = jsonObject.getString("데이터기준일자");

                FestivalModel festivalModel = new FestivalModel(name, place, startdate, enddate, contents,
                        hostagency, managementagency, sponsorship, webpage, address1, address2, lat, lng, datadate);
                festivalModels.add(festivalModel);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
