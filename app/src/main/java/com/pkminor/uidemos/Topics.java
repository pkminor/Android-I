package com.pkminor.uidemos;

import android.content.Context;
import android.widget.ArrayAdapter;


public class Topics extends ArrayAdapter {

    private Context mContext;
    private String[] mTopics;

    public Topics(Context mContext, int resource,  String[] mTopics) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mTopics = mTopics;
    }

    @Override
    public int getCount() {
        return mTopics.length;
    }

    @Override
    public Object getItem(int position) {
        return mTopics[position];
    }
}
