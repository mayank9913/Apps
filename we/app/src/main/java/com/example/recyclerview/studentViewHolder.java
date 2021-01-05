package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class studentViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvStudentName;
    private TextView mTvStudentAge;
    private TextView mTvRollNo;



    public studentViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);
    }

    private void initviews(View itemView) {

        mTvStudentName = itemView.findViewById(R.id.tvstudentName);
        mTvStudentAge = itemView.findViewById(R.id.tvstudentAge);
        mTvRollNo = itemView.findViewById(R.id.tvstudentRollNo);
    }
    public void setData(student student){
        mTvStudentName.setText(student.getName());
        mTvStudentAge.setText(student.getAge() +"");
        mTvRollNo.setText(student.getRollNo() +"");

    }


}
