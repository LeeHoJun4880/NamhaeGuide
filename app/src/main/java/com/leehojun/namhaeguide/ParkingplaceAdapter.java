package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ParkingplaceAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<ParkingplaceModel> data = null;
    private LayoutInflater inflater = null;

    public ParkingplaceAdapter(Context context, int layout, ArrayList<ParkingplaceModel> data) {
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

        TextView tv_parkingplace_name = convertView.findViewById(R.id.tv_parkingplace_name);
        TextView tv_parkingplace_address = convertView.findViewById(R.id.tv_parkingplace_address);
        TextView tv_parkingplace_tel = convertView.findViewById(R.id.tv_parkingplace_tel);

        tv_parkingplace_name.setText(data.get(position).getName());
        tv_parkingplace_address.setText(data.get(position).getAddress2());
        tv_parkingplace_tel.setText(data.get(position).getTel());

        return convertView;
    }
}
