package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodStoreAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<FoodstoreModel> data = null;
    private LayoutInflater inflater = null;

    public FoodStoreAdapter(Context context, int layout, ArrayList<FoodstoreModel> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = inflater.inflate(this.layout,parent, false);
        }

        TextView tv_foodstore_name = convertView.findViewById(R.id.tv_foodstore_name);
        TextView tv_foodstore_type = convertView.findViewById(R.id.tv_foodstore_type);
        TextView tv_foodstore_address = convertView.findViewById(R.id.tv_foodstore_address);
        TextView tv_foodstore_majormenu = convertView.findViewById(R.id.tv_foodstore_majormenu);

        tv_foodstore_name.setText(data.get(position).getName());
        tv_foodstore_type.setText(data.get(position).getType());
        tv_foodstore_address.setText(data.get(position).getAddress());
        tv_foodstore_majormenu.setText(data.get(position).getTel());

        return convertView;
    }
}
