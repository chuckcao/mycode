package com.chuck.code;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.androidcommmon.adapter.BGARecyclerViewAdapter;
import cn.bingoogolapple.androidcommmon.adapter.BGAViewHolderHelper;
import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements  BGARefreshLayout.BGARefreshLayoutDelegate {
    private RecyclerView mDataRv;
    private BGARecyclerViewAdapter mAdapter;
    private BGARefreshLayout mRefreshLayout;
    private int mNewPageNumber = 0;
    private Engine mEngine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_1);
        mEngine =new Retrofit.Builder()
                .baseUrl("http://115.28.86.42:8081/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Engine.class);
        mDataRv = (RecyclerView) findViewById(R.id.data);
        mRefreshLayout = (BGARefreshLayout) findViewById(R.id.rl_recyclerview_refresh);
        setListener();
        processLogic(savedInstanceState);
    }

    private void setListener() {
        mRefreshLayout.setDelegate(this);
        mAdapter=new BGARecyclerViewAdapter<Action1.ResultBean.PageRecordBean>(mDataRv,R.layout.item_normal) {

            @Override
            protected void fillData(BGAViewHolderHelper viewHolderHelper, int position, Action1.ResultBean.PageRecordBean model) {
                viewHolderHelper.setText(R.id.tv_item_normal_title,model.getCfpuName()+"11");
            }
        };
    }
    protected void processLogic(Bundle savedInstanceState) {
        BGANormalRefreshViewHolder moocStyleRefreshViewHolder = new BGANormalRefreshViewHolder(this, true);
        mRefreshLayout.setRefreshViewHolder(moocStyleRefreshViewHolder);

        mDataRv.setLayoutManager(new LinearLayoutManager(this));

        mDataRv.setAdapter(mAdapter);
        mEngine.loadInitDatas(mNewPageNumber+"",10+"",1+"").enqueue(new Callback<Action1>() {
            @Override
            public void onResponse(Call<Action1> call, Response<Action1> response) {
                mAdapter.setData(response.body().getResult().getPageRecord());
            }

            @Override
            public void onFailure(Call<Action1> call, Throwable t) {
            }
        });

    }


    @Override
    public void onBGARefreshLayoutBeginRefreshing(BGARefreshLayout refreshLayout) {

        mEngine.loadInitDatas(1+"",10+"",1+"").enqueue(new Callback<Action1>() {
            @Override
            public void onResponse(Call<Action1> call, final Response<Action1> response) {
                ThreadUtil.runInUIThread(new Runnable() {
                    @Override
                    public void run() {
                        mRefreshLayout.endRefreshing();
                        mAdapter.addNewData(response.body().getResult().getPageRecord());
                        mDataRv.smoothScrollToPosition(0);
                    }
                }, 2000);
            }

            @Override
            public void onFailure(Call<Action1> call, Throwable t) {
                mRefreshLayout.endRefreshing();
            }
        });

    }

    @Override
    public boolean onBGARefreshLayoutBeginLoadingMore(BGARefreshLayout refreshLayout) {
        mEngine.loadInitDatas(1+"",10+"",1+"").enqueue(new Callback<Action1>() {//加载结合RXandroid
            @Override
            public void onResponse(Call<Action1> call, final Response<Action1> response) {
                ThreadUtil.runInUIThread(new Runnable() {
                    @Override
                    public void run() {
                        mRefreshLayout.endLoadingMore();
                        mAdapter.addMoreData(response.body().getResult().getPageRecord());
                    }
                }, 2000);
            }

            @Override
            public void onFailure(Call<Action1> call, Throwable t) {
                mRefreshLayout.endLoadingMore();
            }
        });

        return true;
    }
}
