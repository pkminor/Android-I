package com.pkminor.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_topic);
        Intent intent = getIntent();
        String title = intent.getStringExtra("topic");
        setTitle("Edit "+title);

        EditText  editText = findViewById(R.id.editTopicItem);
        editText.setText(intent.getStringExtra("content"));

        Button btn = findViewById(R.id.btnEdit);
        btn.setOnClickListener((v)->
                Toast.makeText(EditTopic.this,"Edit functionality will be added soon", Toast.LENGTH_LONG).show()
        );

    }
}
