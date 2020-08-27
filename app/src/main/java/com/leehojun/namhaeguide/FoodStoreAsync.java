package com.leehojun.namhaeguide;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class FoodStoreAsync extends AsyncTask<Integer, String, Object> {

    Context context = null;
    ArrayList<FoodstoreModel> foodstoreModels;
    InputStream filename = null;

    public FoodStoreAsync(Context context, InputStream filename) {
        this.context = context;
        this.filename = filename;
        this.foodstoreModels = new ArrayList<FoodstoreModel>();
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

        return foodstoreModels;
    }

    private void Parser(String s){
        try{
            JSONArray jsonArray = new JSONArray(s);
            foodstoreModels.clear();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int no = jsonObject.getInt("연번");
                String type = jsonObject.getString("구분");
                String name = jsonObject.getString("업소명");
                String representative = jsonObject.getString("대표자");
                String address = jsonObject.getString("소재지");
                String tel = jsonObject.getString("전화번호");
                String major = jsonObject.getString("업태");
                String majormenu = jsonObject.getString("주메뉴");

                FoodstoreModel foodstoreModel = new FoodstoreModel(no, type, name, representative, address, tel, major, majormenu);
                foodstoreModels.add(foodstoreModel);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
