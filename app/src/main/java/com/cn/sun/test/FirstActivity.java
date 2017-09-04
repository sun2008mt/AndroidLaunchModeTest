package com.cn.sun.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        Log.e("TaskId: ", getTaskId() + "");
        Log.e("LaunchMode: ", "Standard");
        Log.e("Standard, onCreate: ", getClass().getSimpleName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart: ", getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume: ", getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause: ", getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop: ", getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart: ", getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy: ", getClass().getSimpleName());
    }
}
