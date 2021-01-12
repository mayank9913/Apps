package com.example.multipleviewtypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<PersonalityModel> personalityModelList;
    private RecyclerView rvrecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvrecyclerView = findViewById(R.id.recyclerView);
        buildData();
        setRecyclerData();
    }

    private void setRecyclerData() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvrecyclerView.setLayoutManager(layoutManager);
        PersonalityAdapter personalityAdapter = new PersonalityAdapter(personalityModelList);
        rvrecyclerView.setAdapter(personalityAdapter);
    }

    private void buildData() {
        personalityModelList =new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                personalityModelList.add(new PersonalityModel(R.drawable.billgates,
                        "Bill Gates", "", PersonalityModel.ITEM_TYPE_PERSONALITY));
                personalityModelList.add(new PersonalityModel(0, "", "USA", PersonalityModel.ITEM_TYPE_LOCATION));
            } else {
                personalityModelList.add(new PersonalityModel(R.drawable.jeff,
                        "Jeff Bezos", "", PersonalityModel.ITEM_TYPE_PERSONALITY));
                personalityModelList.add(new PersonalityModel(0, "", "USA", PersonalityModel.ITEM_TYPE_LOCATION));

            }
        }
    }
}