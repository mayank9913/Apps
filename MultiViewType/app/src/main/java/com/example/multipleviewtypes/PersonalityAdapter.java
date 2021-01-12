package com.example.multipleviewtypes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonalityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<PersonalityModel> modelList;

    public PersonalityAdapter(ArrayList<PersonalityModel> modelList) {
        this.modelList = modelList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case PersonalityModel.ITEM_TYPE_PERSONALITY:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personality_item_layout, parent, false);
                return new PersonalityViewHolder(view);
            case PersonalityModel.ITEM_TYPE_LOCATION:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personality_item_layout, parent, false);
                return new LocationViewHolder(view);
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personality_item_layout, parent, false);
                return new PersonalityViewHolder(view);

        }

    }

    @Override
    public int getItemViewType(int position) {
        return modelList.get(position).getViewType();
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PersonalityModel personalityModel = modelList.get(position);
        int viewType = personalityModel.getViewType();

        switch (viewType) {
            case PersonalityModel.ITEM_TYPE_PERSONALITY:
                if (holder instanceof PersonalityViewHolder) {
                    ((PersonalityViewHolder) holder).setData(personalityModel);


                }
                break;
            case PersonalityModel.ITEM_TYPE_LOCATION:
                if (holder instanceof LocationViewHolder) {
                     ((LocationViewHolder) holder).setData(personalityModel);

                }
                break;

        }


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


}
