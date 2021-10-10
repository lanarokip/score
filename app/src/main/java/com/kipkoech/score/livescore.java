package com.kipkoech.score;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class livescore extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListview;
    private String[] countries = new String[] {"Kenya","Tanzania","Uganda","Egypt","Nigeria"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livescore);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries);
        mListview.setAdapter(adapter);

        Intent intent = getIntent();


    }
}