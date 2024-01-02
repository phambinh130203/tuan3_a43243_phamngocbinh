package com.example.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class t3adapter extends BaseAdapter {
    private ArrayList<T3> ls;
    private Context context;

    public t3adapter(final ArrayList<T3> ls, final Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewT3 vax;
        if (convertView == null) {
            vax = new ViewT3();
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan3_listview_item, null);
            vax.img_hinh = convertView.findViewById(R.id.t3ItemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t3ItemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t3ItemTuoi);
            convertView.setTag(vax);
        } else {
            vax = (ViewT3) convertView.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    class ViewT3{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
