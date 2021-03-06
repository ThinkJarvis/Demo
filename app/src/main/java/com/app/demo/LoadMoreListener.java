package com.app.demo;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public abstract class LoadMoreListener extends RecyclerView.OnScrollListener {

    private boolean isSlidingUpward = false;

    @Override
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
            int lastItemPosition = manager.findLastCompletelyVisibleItemPosition();
            int itemCount = manager.getItemCount();

            if (lastItemPosition == (itemCount - 1) && isSlidingUpward) {
                onLoadMore();
            }
        }
    }


    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        isSlidingUpward = dy > 0;
    }

    public abstract void onLoadMore();
}
