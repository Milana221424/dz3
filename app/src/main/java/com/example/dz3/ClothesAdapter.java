package com.example.dz3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesViewHolder>{
    private ArrayList<String> clothesList;
    public ClothesAdapter(ArrayList<String> mealList) {
        this.clothesList = mealList;

    }
    @NonNull
    @Override
    public ClothesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClothesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clothes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClothesViewHolder holder, int position) {
        holder.bind(clothesList.get(position));

    }

    @Override
    public int getItemCount() {
        return clothesList.size() ;
    }
}