package com.rsypj.materi1kontingen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rsypj.materi1kontingen.R;
import com.rsypj.materi1kontingen.adapter.viewholder.MainViewHolder;
import com.rsypj.materi1kontingen.model.ApaModel;

import java.util.ArrayList;

/**
 * Created by dhadotid on 21/11/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context context;
    ArrayList<ApaModel> data;

    public MainAdapter(Context context, ArrayList<ApaModel> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.custom_main, null);

        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MainViewHolder){
            ((MainViewHolder) holder).setUpToUI(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
