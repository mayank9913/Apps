package com.example.multipleviewtypes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonalityViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvPerson;
    private TextView mTVName;

    public PersonalityViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);


    }

    private void initViews(View itemView) {
        mIvPerson =itemView.findViewById(R.id.ivPersonality);
        mTVName = itemView.findViewById(R.id.tvName);
    }
    public void setData(PersonalityModel personalityModel){
        mIvPerson.setImageResource(personalityModel.getImageId());
        mTVName.setText(personalityModel.getPersonalityName());
    }
}

