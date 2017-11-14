package com.fsy.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class BaseActivity extends AppCompatActivity {

    protected  String TAG =  BaseActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"-----------------------onCreate------------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"-----------------------onStart------------------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"-----------------------onRestart------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"-----------------------onPause------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"-----------------------onResume------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"-----------------------onStop------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"-----------------------onDestroy------------------------");
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG,"-----------------------onNewIntent------------------------");
    }

}
