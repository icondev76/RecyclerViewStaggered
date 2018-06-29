package com.icontech.recyclerviewstaggered;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mimages= new ArrayList<>();
    private ArrayList<String> mimagenames= new ArrayList<>();
    private static final int NUM_COL=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBitmaps();
    }

    public void initBitmaps(){
        mimages.add("https://i.redd.it/we5ivqry4n611.jpg");
        mimagenames.add("Washington State");

        mimages.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mimagenames.add("Chilean Patagonia");

        mimages.add("https://i.redd.it/b09ga89nrj611.jpg");
        mimagenames.add("Yosemite");

        mimages.add("https://i.redd.it/we5ivqry4n611.jpg");
        mimagenames.add("Washington State");

        mimages.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mimagenames.add("Chilean Patagonia");

        mimages.add("https://i.redd.it/b09ga89nrj611.jpg");
        mimagenames.add("Yosemite");

        mimages.add("https://i.redd.it/we5ivqry4n611.jpg");
        mimagenames.add("Washington State");

        mimages.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mimagenames.add("Chilean Patagonia");

        mimages.add("https://i.redd.it/b09ga89nrj611.jpg");
        mimagenames.add("Yosemite");
        initRecyclerView();
    }
    public void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(this,mimages,mimagenames);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(NUM_COL, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
