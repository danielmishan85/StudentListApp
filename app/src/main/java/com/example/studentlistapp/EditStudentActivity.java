package com.example.studentlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        Button cancel = findViewById(R.id.edit_student_btnCancel);
        cancel.setOnClickListener(view -> {
            Intent intent = new Intent(this, StudentsListActivity.class);
            startActivity(intent);
        });
        Button delete = findViewById(R.id.edit_student_btnDelete);
        Button save = findViewById(R.id.edit_student_btnSave);

    }
}