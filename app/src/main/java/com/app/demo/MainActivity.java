package com.app.demo;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends FragmentActivity {

    private Handler mHandler = new Handler();
    private int index = 0;


    private ApiService apiService;
    private static final String BASE_URL = "https://bqc53gw-pro.pateo.com.cn/cp/radio/";
    private static final String TOKEN = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJ1aWQiOjI3MzA5LCJhaWQiOiIwMTEwMDIzN2JkZTY0OTU2YjVlMzkwZDRmZTI5M2I5NSIsImxpZCI6Imd1ZXN0IiwibHR5IjoyLCJkaWQiOiJQMDA3MDAwOTAwMDAwMzQ4IiwiZHR5Ijo0LCJqdGkiOiI5NGYwMGQ2Yy0xMGIzLTQ4Y2MtYjc4NC0zNTdkYmVkNjU3YWYiLCJydGkiOiIxYTRkYTdiNi0wMjk2LTRiMDUtYWIzZi0zYmExOGE5MmU5YzciLCJleHAiOjE1NDg5NDM0NjV9.8RtLUXFCHMqWmkxs3PD7vSx-D5Sj-MBC77MJ_k3Vr-kN_9RXmPkJfTN-qlCBg2fC75dt32bvI1rtARiKw85emA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        onCreateView();
        onCreateView1();

    }

    private void onCreateView1() {
        setContentView(R.layout.activity_main1);
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(SettingsFragment.FRAGMENT_TAG);
        if (fragment == null) {
            fragment = new SettingsFragment();
        }

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_menu, fragment, SettingsFragment.FRAGMENT_TAG);
        ft.commit();

    }

    private void onCreateView() {
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter<Integer> myAdapter = new MyAdapter<>();
        final LoadMoreAdapter loadMoreAdapter = new LoadMoreAdapter(myAdapter);
        recyclerView.setAdapter(loadMoreAdapter);
        loadMoreAdapter.setData(getData(index));
        loadMoreAdapter.setLoadStatus(LoadMoreAdapter.STATE_LOAD_MORE);
        loadMoreAdapter.notifyDataSetChanged();

        recyclerView.addOnScrollListener(new LoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreAdapter.getLoadStatus() == LoadMoreAdapter.STATE_LOAD_MORE) {
                    if (index >= 2) {
                        loadMoreAdapter.setLoadStatus(LoadMoreAdapter.STATE_LOAD_END);
                        loadMoreAdapter.notifyDataSetChanged();
                    } else {
                        loadMoreAdapter.setLoadStatus(LoadMoreAdapter.STATE_LOADING);
                        loadMoreAdapter.notifyDataSetChanged();
                        mHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                index++;
                                loadMoreAdapter.setData(getData(index));
                                loadMoreAdapter.setLoadStatus(LoadMoreAdapter.STATE_LOAD_MORE);
                                loadMoreAdapter.notifyDataSetChanged();
                            }
                        }, 3000);
                    }
                }


            }
        });


        createAPIService();

        apiService.getTracksByAlbum(TOKEN, "DT00000001", 2,
                "com.ximalaya.ting.android.botaichezai", "P007000900000348",
                203355, 1, 1, 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<XmlyTracksByAlbum>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        Log.e("wjq", "onSubscribe");
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(XmlyTracksByAlbum xmlyTracksByAlbum) {
                        Log.e("wjq", "onNext = " + xmlyTracksByAlbum.getData().getAlbum_intro());
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.e("wjq", "onError = " + t.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("wjq", "onComplete");
                    }
                });
    }


    private List<Integer> getData(int index) {
        List<Integer> list = new ArrayList<>();
        for (int i = index * 20; i < 20 * (index + 1); i++) {
            list.add(i);
        }
        return list;
    }


    public void createAPIService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }
}
