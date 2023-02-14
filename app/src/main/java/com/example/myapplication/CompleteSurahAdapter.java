package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CompleteSurahAdapter extends RecyclerView.Adapter<CompleteSurahAdapter.viewHolder> {

        ArrayList<CompleteSurah> list;
        Context context;
//    create constructor of the both of the following will be used in the main class
public CompleteSurahAdapter(ArrayList<CompleteSurah> list, Context context) {
        this.list = list;
        this.context = context;
        }

@NonNull
@Override
public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.completesurah,parent,false);
        return new viewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            CompleteSurah model=list.get(position);
            holder.ayatno.setText(model.getNumber());
            holder.ayatval.setText(model.getText());
            holder.tarjama.setText(model.getTranslation());

    }

@Override
public int getItemCount() {
        return list.size();
        }

public class viewHolder extends RecyclerView.ViewHolder {
    //        cardview (which is our layout) ko hum idher hi inflate kar lety ha

    TextView ayatno;
    TextView ayatval;
    TextView tarjama;



    public viewHolder(@NonNull View itemView) {
        super(itemView);
        ayatno = itemView.findViewById(R.id.Ayatno);
        ayatval=itemView.findViewById(R.id.ayatval);
        tarjama=itemView.findViewById(R.id.tarjama);

    }
}
}
