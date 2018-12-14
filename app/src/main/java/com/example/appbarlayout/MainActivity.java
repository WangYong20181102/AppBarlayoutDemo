package com.example.appbarlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.appbarlayout.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycleview_test)
    RecyclerView recycleviewTest;
    private MyAdapter adapter;
    private List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        stringList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            stringList.add("这是一条消息" + i);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycleviewTest.setLayoutManager(linearLayoutManager);
        adapter = new MyAdapter(this, stringList);
        recycleviewTest.setAdapter(adapter);
    }
}
