package com.example.multipleviewtypes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LocationViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvLocation;

    public LocationViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvLocation = itemView.findViewById(R.id.tvLocationName);

    }
    public void  setData(PersonalityModel personalityModel){
        mTvLocation.setText(personalityModel.getLocationName());
    }
}
