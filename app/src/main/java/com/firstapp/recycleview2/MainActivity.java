package com.firstapp.recycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.gi,"Rohat 18sw01"," "," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.gi,"Mahrukh 18sw02",""," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.girl,"Iqra 18sw03"," "," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.gi,"Misbah  18sw04",""," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.bo,"Unza 18sw05"," "," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.boy,"Neha 18sw06"," "," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.gi,"Rabia 18sw07",""," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.boy,"Muntaha 18sw08",""," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.gi,"Jharna 18sw09"," "," ","_______________________________________"));
        userList.add(new ModelClass(R.drawable.girl,"Durdana 18sw10"," "," ","_______________________________________"));





    }


}