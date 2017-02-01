package com.example.dell.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG=FirstActivity.class.toString();
    public static final String EXTRA_MSG_KEY="Extra message key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final Button btncall = (Button)findViewById(R.id.btncallimplicit);
        final Button btncall2= (Button) findViewById(R.id.btncallexplicit);
        final Button btncall3= (Button) findViewById(R.id.btnsimpleexplicit);
        final Button btncall4= (Button) findViewById(R.id.btnCustom);
        final Button btncall5= (Button) findViewById(R.id.btnFAS);
        final EditText etexplicit =(EditText) findViewById(R.id.etexplicit);
        Log.d(TAG, "is OnCreate");


        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_DIAL);
                FirstActivity.this.startActivity(sendIntent);
            }

        });

        btncall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(FirstActivity.this,SecondActivity.class);
                sendIntent.putExtra(EXTRA_MSG_KEY, etexplicit.getText().toString());
                startActivity(sendIntent);
            }
        });

        btncall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(FirstActivity.this,grid.class);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"This is the simple grid view");
                startActivity(sendIntent);
            }
        });
        btncall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(FirstActivity.this,CustomView.class);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"This is the custom view");
                startActivity(sendIntent);
            }
        });

    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"is OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "is OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "is OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "is OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "is OnDestroy");
    }
}
