package com.app.demo;

import android.support.v7.widget.RecyclerView;

import java.util.List;


public abstract class BaseAbstractAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public abstract void setData(List<T> list);
}
