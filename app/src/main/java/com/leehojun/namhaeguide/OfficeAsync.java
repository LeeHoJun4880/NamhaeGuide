package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class OfficeAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<OfficeModel> officeModels;
    InputStream filename = null;

    public OfficeAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.officeModels = new ArrayList<OfficeModel>();
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

        return officeModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            officeModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int no = jsonObject.getInt("순번");
                String name = jsonObject.getString("기관명");
                String addr = jsonObject.getString("주소");
                String tel = jsonObject.getString("연락처");

                OfficeModel officeModel = new OfficeModel(no, name, addr, tel);
                officeModels.add(officeModel);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
