package com.example.carproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    private Context context;
    private ArrayList<book_ride_1_model> arrContacts;

    public RecyclerContactAdapter(Context context, ArrayList<book_ride_1_model> arrContacts) {
        this.context = context;
        this.arrContacts = arrContacts; // Correctly initializing the member variable.
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.book_ride_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        book_ride_1_model modal = arrContacts.get(position);
        holder.imgView.setImageResource(modal.getImg()); // Assuming getters are present in your model.
        holder.txtNum.setText(modal.getAddress());
        holder.txtContact.setText(modal.getName());
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNum, txtContact;
        ImageView imgView;
        LinearLayout linear1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNum = itemView.findViewById(R.id.txtaddress);
            txtContact = itemView.findViewById(R.id.txtname);
            imgView = itemView.findViewById(R.id.imgview);
            linear1 = itemView.findViewById(R.id.linear1);
        }
    }
}
