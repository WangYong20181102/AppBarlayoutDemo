package com.example.appbarlayout.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appbarlayout.R;

import java.util.List;

/**
 * Created by Mr.Wang on 2018/12/13 10:22.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<String> stringList;

    public MyAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.test_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).tvTittle.setText(stringList.get(position).toString());
        }
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTittle;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTittle = itemView.findViewById(R.id.tv_tittle);
        }
    }
}
