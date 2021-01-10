package com.example.animal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvimage21;
    private TextView mTvtype21;
    private TextView mTvname21;
    private ItemClickListener itemClickListener;
    private LinearLayout linearLayout;

    public AnimalViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener= itemClickListener;
        initviews(itemView);
    }

    private void initviews(View itemView) {
    mIvimage21 = itemView.findViewById(R.id.ivimage21);
    mTvtype21 = itemView.findViewById(R.id.tvtype21);
    mTvname21 = itemView.findViewById(R.id.tvName21);
    linearLayout = itemView.findViewById(R.id.llAnimal);

    }

    public void setData(Animal animal) {
        mIvimage21.setImageResource(animal.getImageid());
        mTvtype21.setText(animal.getType());
        mTvname21.setText(animal.getName());

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onItemClicked(animal);
                }
            });
    }

}
