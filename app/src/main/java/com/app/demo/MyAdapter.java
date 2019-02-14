package com.app.demo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter<T> extends BaseAbstractAdapter<T> {

    private List<T> mList;

    public MyAdapter() {
        mList = new ArrayList<>();
    }

    @Override
    public void setData(List<T> list) {
        mList.addAll(list);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((MyViewHolder)viewHolder).mTextInfo.setText(mList.get(i)+ "");
    }


    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextInfo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextInfo = itemView.findViewById(R.id.item_text);
        }
    }
}
