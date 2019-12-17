package com.pkminor.uidemos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DetailsBaseAdapter extends BaseAdapter {

    private String[] details;
    private Context mContext;

    public DetailsBaseAdapter(Context mContext,String[] details) {
        this.details = details;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return details.length;
    }

    @Override
    public Object getItem(int position) {
        return details[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View listView;

        if(convertView==null){
            listView = inflater.inflate(R.layout.details_listview_item,null);

            TextView textView = (TextView) listView.findViewById(R.id.listView_item_detail);
            textView.setText(getItem(position).toString());
        }else{
            listView=convertView;
        }

        return  listView;
    }
}
