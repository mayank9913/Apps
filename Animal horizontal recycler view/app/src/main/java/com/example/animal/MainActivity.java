package com.example.animal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Article> animalList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvArticle);
        buildData();
        setRecyclerData();


    }
    private void buildData() {
        animalList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                animalList.add(new Article(R.drawable.cheetah, "Type : Mammal", "Cheetah"));

            } else if (i % 3 == 1) {
                animalList.add(new Article(R.drawable.owl, "Type : Bird", "Great Horned Owl"));

            } else if (i % 3 == 2) {
                animalList.add(new Article(R.drawable.shark, "Type : Fish", "Great White Shark"));

            }
        }



    }
    private void setRecyclerData() {
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
       recyclerView.setLayoutManager(linearLayoutManager);
        ArticleAdapter articleAdapter =  new ArticleAdapter(animalList, this);
        recyclerView.setAdapter(articleAdapter);

    }


    @Override
    public void onItemClicked(Article article) {
        Toast.makeText(this, "Animal name is " +article.getName(), Toast.LENGTH_SHORT).show();

    }
}