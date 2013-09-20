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
                  if (MainActivity.EXTRA_MESSAGE == "stoppify") timer.cancel();
                }
              },
              0,
              1000);
        //try{ Thread.sleep(1000); }catch(InterruptedException e){ }
        //    toast.setText(i);//.show();
        //}
    }

    //public Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
  //public timeSoulGem() {
  //    super("timeSoulGem");
  //}
    public String datastring = "timeSoulGem";
    //public Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    public timeSoulGem() {
        super("timeSoulGem");
    }
    //public void onCreate(Bundle savedInstanceState) {
    //    Vibrator v = (Vibrator) getSystemService(timeSoulGem.VIBRATOR_SERVICE);
    //}
    @Override
    protected void onHandleIntent(Intent intent) {

      //Toast.makeText(this, "peanut", Toast.LENGTH_SHORT).show();
        if (MainActivity.EXTRA_MESSAGE == "startify") {
            vibrationSoulGem();
        } else {
            if (timer != null) timer.cancel();
        }
   //   String whatDo = intent.getStringExtra(datastring);
   //   //String whatDo = intent.getDataString();

      //Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
//          v.vibrate(5000);

   //   if (v != null && whatDo.equals("startTheClockFucker")) {
   //       //start the sould gems beat (turn on the haptic clock)
   //       //Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
   //       //long[] pattern = { 0 , 100 , 400 };
   //       //v.vibrate(pattern, 0);
   //       v.vibrate(500);
   //       //v.cancel();
   //   }
   //   if (v != null && whatDo.equals("stopTheClockFucker")) {
   //       //silence its beating (turn off the haptic clock)
   //       //Vibrator v = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);
   //       //(Vibrator) getSystemService(VIBRATOR_SERVICE).cancel();
   //       v.cancel();
   //       //v.vibrate(2000);
            //long[] pattern = {0,500,500};
            //v.vibrate(pattern, 0);
   //   }
    }
}



