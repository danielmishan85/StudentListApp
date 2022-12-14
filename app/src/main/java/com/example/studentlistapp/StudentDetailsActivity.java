package com.example.studentlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class StudentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        Button edit = findViewById(R.id.student_details_btnEdit);
        edit.setOnClickListener(view -> {
            Intent intent = new Intent(this, EditStudentActivity.class);
            startActivity(intent);
        });
    }
}