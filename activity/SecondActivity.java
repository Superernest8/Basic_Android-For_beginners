package com.example.dell.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent passedIntent= getIntent();
        Bundle extras = null;
        if (passedIntent != null){
            extras = passedIntent.getExtras();
        }
        if (extras != null && extras.containsKey(FirstActivity.EXTRA_MSG_KEY)) {
            Toast.makeText(this,extras.getString(FirstActivity.EXTRA_MSG_KEY),Toast.LENGTH_LONG).show();
        }
        ListView listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.list_objects_solar_system)));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(),(String) parent.getAdapter().getItem(position),Toast.LENGTH_SHORT ).show();
            }
        });

    }

}
