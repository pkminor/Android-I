package com.pkminor.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class CardsActivity extends AppCompatActivity {

    private String lorem;
    private String[] topicDetails;
    private ListView listViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        lorem = getResources().getString(R.string.lorem);
        topicDetails = new String[] { lorem,lorem,lorem,lorem,lorem};

        String title = getIntent().getStringExtra("title");
        setTitle(title);

        listViewDetails = (ListView) findViewById(R.id.listViewDetails);

        //Details adapter = new Details(this, android.R.layout.simple_list_item_1, topicDetails);
        DetailsBaseAdapter baseAdapter = new DetailsBaseAdapter(this,topicDetails);
        listViewDetails.setAdapter(baseAdapter);

        listViewDetails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent editIntent =new Intent(CardsActivity.this,EditTopic.class);
                editIntent.putExtra("topic",title);
                editIntent.putExtra("content",baseAdapter.getItem(position).toString() );
                startActivity(editIntent);
            }
        });

    }
}
