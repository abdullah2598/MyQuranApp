package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        RecyclerView rc=findViewById(R.id.rec);
        DBHelper d=new DBHelper(this);
        ArrayList<CompleteSurah> list= d.getSurah(name);
        CompleteSurahAdapter adapters=new CompleteSurahAdapter(list,this)   ;
        rc.setAdapter(adapters);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        rc.setLayoutManager(layoutManager);


    }
}