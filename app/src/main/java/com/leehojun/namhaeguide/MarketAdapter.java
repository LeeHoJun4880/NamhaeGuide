package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MarketAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<MarketModel> data = null;
    private LayoutInflater inflater = null;

    public MarketAdapter(Context context, int layout, ArrayList<MarketModel> data) {
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

        TextView tv_market_name = convertView.findViewById(R.id.tv_market_name);
        TextView tv_market_address = convertView.findViewById(R.id.tv_market_address);
        TextView tv_market_type = convertView.findViewById(R.id.tv_market_type);
        TextView tv_market_productkinds = convertView.findViewById(R.id.tv_market_productkinds);

        tv_market_name.setText(data.get(position).getName());
        tv_market_address.setText(data.get(position).getAddress1());
        tv_market_type.setText(data.get(position).getType());
        tv_market_productkinds.setText(data.get(position).getProductkinds());

        return convertView;
    }
}
