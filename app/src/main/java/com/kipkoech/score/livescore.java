package com.kipkoech.score;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class livescore extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListview;
    private String[] countries = new String[] {"Kenya","Tanzania","Uganda","Egypt","Nigeria","Egypt"};
    private String[] noGames = new String[] {"10","2","22","4","65","56"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livescore);
        ButterKnife.bind(this);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries);
//        mListview.setAdapter(adapter);
        livescoreAdapter adapter = new livescoreAdapter(this, android.R.layout.simple_list_item_1,countries,noGames);
        mListview.setAdapter(adapter);



      mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent = new Intent(livescore.this,matches.class);
              startActivity(intent);
          }
      });




    }
}