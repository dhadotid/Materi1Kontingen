package com.rsypj.materi1kontingen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rsypj.materi1kontingen.adapter.MainAdapter;
import com.rsypj.materi1kontingen.model.ApaModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView listIsi;
    MainAdapter adapter;
    ArrayList<ApaModel> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listIsi = (RecyclerView)findViewById(R.id.activity_main_rlv);
        setAdapter();
        dummyData();
    }

    private void setAdapter(){
        adapter = new MainAdapter(this, data);

        listIsi.setItemAnimator(new DefaultItemAnimator());
        listIsi.setLayoutManager(new GridLayoutManager(this, 2));
        listIsi.setAdapter(adapter);
    }

    private void dummyData(){
        data.add(new ApaModel(1, "Judul", "Isi"));
        data.add(new ApaModel(2, "Juduuulll", "Isiiiiii"));
        data.add(new ApaModel(3, "Judul111111111", "Isiiiiiii111111"));
    }
}
