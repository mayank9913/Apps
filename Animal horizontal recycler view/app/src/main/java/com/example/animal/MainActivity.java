package com.example.animal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvAnimal);
        buildData();
        setRecyclerData();


    }
    private void buildData() {
        animalList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                animalList.add(new Animal(R.drawable.cheetah, "Type : Mammal", "Cheetah"));

            } else if (i % 3 == 1) {
                animalList.add(new Animal(R.drawable.owl, "Type : Bird", "Great Horned Owl"));

            } else if (i % 3 == 2) {
                animalList.add(new Animal(R.drawable.shark, "Type : Fish", "Great White Shark"));

            }
        }



    }
    private void setRecyclerData() {
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false );
       recyclerView.setLayoutManager(linearLayoutManager);
        AnimalAdapter animalAdapter =  new AnimalAdapter(animalList, this);
        recyclerView.setAdapter(animalAdapter);

    }


    @Override
    public void onItemClicked(Animal animal) {
        Toast.makeText(this, "Animal name is " +animal.getName(), Toast.LENGTH_SHORT).show();

    }
}