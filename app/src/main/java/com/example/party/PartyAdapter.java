package com.example.party;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PartyAdapter extends RecyclerView.Adapter<PartyAdapter.PartyViewHolder> {
    ArrayList<Party> parties;
    Intent intent;
    Context context;

    public PartyAdapter(ArrayList<Party> parties, Intent intent, Context context) {
        this.parties = parties;
        this.intent=intent;
        this.context = context;
    }

    public class PartyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView time;
        TextView address;
        TextView rad;
        TextView date;
        LinearLayout linearLayout;

        public PartyViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.imageView);
            name = (TextView) view.findViewById(R.id.name);
            address = (TextView) view.findViewById(R.id.address);
            rad = (TextView) view.findViewById(R.id.rad);
            time = (TextView) view.findViewById(R.id.time);
            date = (TextView) view.findViewById(R.id.date);
            linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout2);

        }
    }

    @NonNull
    @Override
    public PartyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_party, parent, false);
        return new PartyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PartyViewHolder holder, final int position) {
        holder.name.setText(parties.get(position).getName());
        holder.img.setImageResource(parties.get(position).getImg());
        holder.rad.setText(parties.get(position).getRad());
        holder.address.setText(parties.get(position).getAddress());
        holder.time.setText(parties.get(position).getTime());
        holder.date.setText(parties.get(position).getDate());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                intent.putExtra("name",parties.get(position).getName());
                intent.putExtra("desc",parties.get(position).getDesc());
                intent.putExtra("img",parties.get(position).getImg());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return parties.size();
    }
}
