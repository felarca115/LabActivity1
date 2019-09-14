package com.felarca.sept14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void ustWebsite(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(intent);
    }
    public void myusteWebsite(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://myuste.ust.edu.ph"));
        startActivity(intent);
    }
    public void blackboardWebsite(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ust.blackboard.com"));
        startActivity(intent);
    }

}