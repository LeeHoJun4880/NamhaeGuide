package com.leehojun.namhaeguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FestivalAdapter extends BaseAdapter {

    private Context context = null;
    private int layout = 0;
    private ArrayList<FestivalModel> data = null;
    private LayoutInflater inflater = null;

    public FestivalAdapter(Context context, int layout, ArrayList<FestivalModel> data) {
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

        TextView tv_festival_name = convertView.findViewById(R.id.tv_festival_name);
        TextView tv_festival_startdate = convertView.findViewById(R.id.tv_festival_startdate);
        TextView tv_festival_enddate = convertView.findViewById(R.id.tv_festival_enddate);
        TextView tv_festival_contents = convertView.findViewById(R.id.tv_festival_contents);

        tv_festival_name.setText(data.get(position).getName());
        tv_festival_startdate.setText("축제시작일자 : "+data.get(position).getStartdate());
        tv_festival_enddate.setText("축제종료일자 : "+data.get(position).getEnddate());
        tv_festival_contents.setText("축제내용 : "+data.get(position).getContents());

        return convertView;
    }
}
