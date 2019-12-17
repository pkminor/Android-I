package com.pkminor.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //@BindView(R.id.listView)

    private ListView mTopicsView;
    private String[] mTopics = new String[] {"Android","Kotlin","Python","Go","Flutter","React","Angular"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);

        mTopicsView = (ListView) findViewById(R.id.listView);
        Topics topic = new Topics(this,android.R.layout.simple_list_item_1, mTopics);
        mTopicsView.setAdapter(topic);

        mTopicsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent topicDetails = new Intent(MainActivity.this,CardsActivity.class);
                topicDetails.putExtra("title",mTopics[position]);
                startActivity(topicDetails);
            }
        });

    }
}
