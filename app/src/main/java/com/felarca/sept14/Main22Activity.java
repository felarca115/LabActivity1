package com.felarca.sept14;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
    }

    public void openPortals(View v){
        startActivity(new Intent(Main22Activity.this, MainActivity.class));
    }

    public void openGreetings(View v){
        Log.d("MyService", "Hello ");
    }

}
