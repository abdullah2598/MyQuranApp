package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.viewHolder> {

    ArrayList<AyatSurahcla> list;
    Context context;
    //    create constructor of the both of the following will be used in the main class
    public SurahAdapter(ArrayList<AyatSurahcla> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.surahlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        AyatSurahcla model=list.get(position);
        holder.surahname.setText(model.getValue());

        // us pory item pe kahi pe click karo to ye onclick khul jay ga
        // pory 1 cardview pe click karo kahi b to new activity pe chalay jain gay
        holder.surahname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // is ma hum us ki surah ki full detial show karin gay
                Intent intent=new Intent(context,MainActivity5.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        //        cardview (which is our layout) ko hum idher hi inflate kar lety ha

        TextView surahname;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            surahname = itemView.findViewById(R.id.surahname);

        }
    }
}
