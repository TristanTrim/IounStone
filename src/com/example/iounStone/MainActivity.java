package com.example.iounStone;

import android.app.IntentService;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.net.Uri;
import android.os.Vibrator;

import android.widget.Toast;


public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.example.iounStone.MESSAGE";
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }
    public void startClock(View view) {
        Intent startClockServiceIntent = new Intent(this, timeSoulGem.class);
        String datastring = "startTheClockFucker";
        startClockServiceIntent.putExtra(datastring, datastring);
        //startClockServiceIntent.putExtra(timeSoulGem.vib, v);
        Toast.makeText(this, datastring, Toast.LENGTH_SHORT).show();
        //startClockServiceIntent.setData(Uri.parse(datastring));
        startService(startClockServiceIntent);
        // Do something in response to button.
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //startActivity(intent);
    }
    public void vibrationOff(View view) {
        // Do something in response to button.
        Intent startClockServiceIntent = new Intent(this, timeSoulGem.class);
        String datastring = "stopTheClockFucker";
        startClockServiceIntent.putExtra(datastring, datastring);
        //stopClockServiceIntent.putExtra(timeSoulGem.vib, v);
        //stopClockServiceIntent.setData(Uri.parse("stopTheClockFucker"));
        startService(startClockServiceIntent);
        //Intent intent = new Intent(this, VibrationOff.class);
        //startActivity(intent);
    }

}
