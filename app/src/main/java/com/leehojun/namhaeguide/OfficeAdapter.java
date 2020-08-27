package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class OfficeAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<OfficeModel> data = null;
    private LayoutInflater inflater = null;

    public OfficeAdapter(Context context, int layout, ArrayList<OfficeModel> data) {
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

        TextView tv_office_name = convertView.findViewById(R.id.tv_office_name);
        TextView tv_office_address = convertView.findViewById(R.id.tv_office_address);
        TextView tv_office_tel = convertView.findViewById(R.id.tv_office_tel);

        tv_office_name.setText(data.get(position).getOffice_name());
        tv_office_address.setText(data.get(position).getOffice_addr());
        tv_office_tel.setText(data.get(position).getOffice_tel());

        return convertView;
    }
}
