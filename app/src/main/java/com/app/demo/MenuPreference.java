package com.app.demo;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.view.View;

public class MenuPreference extends android.support.v7.preference.Preference {

    private View mItemView;
    private boolean isCreated = true;

    public MenuPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public MenuPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MenuPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MenuPreference(Context context) {
        super(context);
    }

    @Override
    public void onAttached() {
        super.onAttached();
    }


    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        mItemView = holder.itemView;
        if (isCreated && getKey().equals("network")) {
            mItemView.setBackgroundColor(Color.RED);
            isCreated = false;
        }
    }


    public View getItemView() {
        return mItemView;
    }

    @Override
    protected void notifyHierarchyChanged() {
        super.notifyHierarchyChanged();
    }


}
