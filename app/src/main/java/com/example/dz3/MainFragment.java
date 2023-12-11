package com.example.dz3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rv_clothes;
    private ArrayList<String> clothesList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_clothes = requireActivity().findViewById(R.id.rv_clothes);
        loadData();
        initAdapter();
    }
    private void loadData() {
        clothesList.add("Jean");
        clothesList.add("Shirt");
        clothesList.add("Trousers");
        clothesList.add("Skirt");
        clothesList.add("Shoes");
        clothesList.add("Bags");
        clothesList.add("Dress");
        clothesList.add("Coat");
        clothesList.add("Cardigans");
        clothesList.add("Jacket");
        clothesList.add("T-Shirts");
        clothesList.add("Trench");
        clothesList.add("Accessories");
        clothesList.add("Socks");
    }

    private void initAdapter() {
        ClothesAdapter adapter = new ClothesAdapter(clothesList);
        rv_clothes.setAdapter(adapter);
    }
}