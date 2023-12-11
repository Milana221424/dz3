package com.example.dz3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClothesViewHolder extends RecyclerView.ViewHolder {
    private TextView ListName;
    public ClothesViewHolder(@NonNull View itemView) {
        super(itemView);
        ListName = itemView.findViewById(R.id.list_name);
    }
    public void bind(String name ){
        ListName.setText(name);
    }
}