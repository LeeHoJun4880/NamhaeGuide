package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HospitalAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<HospitalModel> data = null;
    private LayoutInflater inflater = null;

    public HospitalAdapter(Context context, int layout, ArrayList<HospitalModel> data) {
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

        TextView tv_hospital_name = convertView.findViewById(R.id.tv_hospital_name);
        TextView tv_hospital_address = convertView.findViewById(R.id.tv_hospital_address);
        TextView tv_hospital_tel = convertView.findViewById(R.id.tv_hospital_tel);

        tv_hospital_name.setText(data.get(position).getHospital_name());
        tv_hospital_address.setText(data.get(position).getHospital_address());
        tv_hospital_tel.setText(data.get(position).getHospital_tel());

        return convertView;
    }
}
