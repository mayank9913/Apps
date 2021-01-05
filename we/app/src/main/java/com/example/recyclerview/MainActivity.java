 package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    private ArrayList<student> studentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.studentRecyclerView);
        buildData();
        setRecyclerData();

    }


    private void buildData() {
        studentList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                studentList.add(new student("Nipun", 18, 123456));
            } else if (i % 4 == 1) {
                studentList.add(new student("Vaibhav", 20, 125657));

            } else if (i % 4 == 2) {
                studentList.add(new student("sai", 22, 124597));

            } else if (i % 4 == 3) {
                studentList.add(new student("Abhinav", 21, 124567));

            }
        }

    }

    private  void setRecyclerData(){
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        StudentAdapter adapter = new StudentAdapter(studentList);
        mRecyclerView.setAdapter(adapter);
    }
}