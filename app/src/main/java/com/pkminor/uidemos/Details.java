package com.pkminor.uidemos;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Details extends ArrayAdapter {
    private String[] mTopicDetails;
    private Context mContext;

    public Details(Context mContext, int resource, String[] mTopicDetails) {
        super(mContext, resource);
        this.mTopicDetails = mTopicDetails;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mTopicDetails.length;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return mTopicDetails[position];
    }
}
