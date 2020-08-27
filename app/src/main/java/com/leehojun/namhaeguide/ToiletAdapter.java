package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ToiletAdapter extends BaseAdapter {


    private Context context = null;
    private int layout = 0;
    private ArrayList<ToiletModel> data = null;
    private LayoutInflater inflater = null;

    public ToiletAdapter(Context context, int layout, ArrayList<ToiletModel> data) {
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
            convertView = inflater.inflate(this.layout,parent,false);
        }

        TextView tv_toilet_name = convertView.findViewById(R.id.tv_toilet_name);
        TextView tv_toilet_type = convertView.findViewById(R.id.tv_toilet_type);
        TextView tv_toilet_address = convertView.findViewById(R.id.tv_toilet_address);

        tv_toilet_name.setText(data.get(position).getName());
        tv_toilet_type.setText(data.get(position).getType());
        tv_toilet_address.setText(data.get(position).getAddress2());

        return convertView;
    }



}
