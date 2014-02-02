package com.example.iounStone;

import android.content.Context;
import android.content.ContextWrapper;
import android.app.Service;
import android.app.IntentService;
import android.os.Bundle;
import android.content.Intent;
import android.os.Vibrator;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;

//For fucking debuging stuff....!    FUCK FUCK FUCK FUCK FUCK!!!!!!!!!!!!!!!!!!!!
import android.widget.Toast;

//timeSoulGem is just my silly name for the background service that runs the resonatio clock.
public class timeSoulGem extends IntentService {

    private Timer timer = new Timer();


    private void vibrationSoulGem() {
        timer.scheduleAtFixedRate(
            new TimerTask() {
                public void run() {
                    Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    v.vibrate(500);
                    if (MainActivity.EXTRA_MESSAGE == "stoppify") timer.cancel();//       //silence its beating (turn off the haptic clock)
                }
            },
            0,
            1000);
    }

    public timeSoulGem() {
        super("timeSoulGem");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        if (MainActivity.EXTRA_MESSAGE == "startify") {
            vibrationSoulGem();
        } else {
            if (timer != null) timer.cancel();
        }
    }
}



