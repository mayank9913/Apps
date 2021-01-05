package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<studentViewHolder>{
    private ArrayList<student> studentList;
    public StudentAdapter(ArrayList<student>studentList){
        this.studentList = studentList;

    }

    @NonNull
    @Override
    public studentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new studentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull studentViewHolder holder, int position) {
        student student = studentList.get(position);
        holder.setData(student);

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
