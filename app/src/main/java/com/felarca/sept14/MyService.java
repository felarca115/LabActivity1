package com.felarca.sept14;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {

    public MyService(){
        super("d");
    }

    protected void onHandleIntent(@Nullable Intent intent){
        for(int i = 0; i < 10; i++){
            Log.d("MyService", "Hello " + (i+1));
        }
    }


}
