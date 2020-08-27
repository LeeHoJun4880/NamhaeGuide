package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class HospitalAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<HospitalModel> hospitalModels;
    InputStream filename = null;

    public HospitalAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.hospitalModels = new ArrayList<HospitalModel>();
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

        return hospitalModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            hospitalModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int no = jsonObject.getInt("순번");
                String name = jsonObject.getString("업소명");
                String address = jsonObject.getString("주소");
                String tel = jsonObject.getString("전화번호");
                String weekday_starttime = jsonObject.getString("평일시작시간");
                String weekday_endtime = jsonObject.getString("평일종료시간");
                String saturday_starttime = jsonObject.getString("토요일시작시간");
                String saturday_endtime = jsonObject.getString("토요일종료시간");
                String holiday_starttime = jsonObject.getString("공휴일시작시간");
                String holiday_endtime = jsonObject.getString("공휴일종료시간");
                String remark = jsonObject.getString("비고");

                HospitalModel hospitalModel = new HospitalModel(no, name, address, tel, weekday_starttime, weekday_endtime, saturday_starttime, saturday_endtime, holiday_starttime, holiday_endtime, remark);
                hospitalModels.add(hospitalModel);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
