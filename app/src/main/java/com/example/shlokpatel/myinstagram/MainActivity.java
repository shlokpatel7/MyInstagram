package com.example.shlokpatel.myinstagram;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.SlideInDownAnimator;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class MainActivity extends AppCompatActivity {
    ArrayList<my_feed> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add(new my_feed("https://picsum.photos/200/300?image=18","https://picsum.photos/200/300/?image=785","shlokpatel",R.drawable.like,R.drawable.chat,R.drawable.sent));
        arrayList.add(new my_feed("https://picsum.photos/200/300/?image=123","https://picsum.photos/200/300/?image=679","rock123",R.drawable.like,R.drawable.chat,R.drawable.sent));
        arrayList.add(new my_feed("https://picsum.photos/200/300/?image=567","https://picsum.photos/200/300/?image=90","heyitsme",R.drawable.like,R.drawable.chat,R.drawable.sent));
        arrayList.add(new my_feed("https://picsum.photos/200/300/?image=983","https://picsum.photos/200/300/?image=453","Mainhero",R.drawable.like,R.drawable.chat,R.drawable.sent));
        arrayList.add(new my_feed("https://picsum.photos/200/300/?image=498","https://picsum.photos/200/300/?image=958","samsung",R.drawable.like,R.drawable.chat,R.drawable.sent));
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter myStudentAdapter = new RecyclerViewAdapter(arrayList,this);
        recyclerView.setAdapter(myStudentAdapter);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

    }
}
