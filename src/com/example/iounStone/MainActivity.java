package com.example.iounStone;

import android.content.Context;
import android.app.IntentService;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.net.Uri;
import android.os.Vibrator;

import android.widget.Toast;


public class MainActivity extends Activity {

    public static String EXTRA_MESSAGE = "";
    


    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void startClock(View view) {
        Intent startClockServiceIntent = new Intent(this, timeSoulGem.class);
        EXTRA_MESSAGE = "startify";
        
        startService(startClockServiceIntent);
    }


    public void vibrationOff(View view) {
        // Do something in response to button.
        Intent startClockServiceIntent = new Intent(this, timeSoulGem.class);
        EXTRA_MESSAGE = "stoppify";
        startService(startClockServiceIntent);
    }

}
