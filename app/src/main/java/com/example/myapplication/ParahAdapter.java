package com.example.myapplication;

import static com.example.myapplication.R.layout.parahlayout;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParahAdapter extends RecyclerView.Adapter<ParahAdapter.viewHolder> {

    ArrayList<AyatSurahcla> list;
    Context context;
    //    create constructor of the both of the following will be used in the main class
    public ParahAdapter(ArrayList<AyatSurahcla> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ParahAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(parahlayout,parent,false);
        return new ParahAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParahAdapter.viewHolder holder, int position) {
        AyatSurahcla model=list.get(position);
        holder.parahname.setText(model.getValue());

        holder.parahname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(context,MainActivity.class);
                intent.putExtra("parano",model.getValue());
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

        TextView parahname;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            parahname = itemView.findViewById(R.id.parahname);

        }
    }
}
