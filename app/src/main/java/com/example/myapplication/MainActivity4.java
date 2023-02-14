package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    // this is fro the surah
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        RecyclerView rc=findViewById(R.id.rc);
        DBHelper d=new DBHelper(this);
        ArrayList<AyatSurahcla> list= d.getAllSurah();
        SurahAdapter adapters=new SurahAdapter(list,this)   ;
        rc.setAdapter(adapters);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        rc.setLayoutManager(layoutManager);
    }
}