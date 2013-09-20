package com.example.iounStone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Vibrator;

public class startClock extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();

        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);

        //define pattern for vibration
        long[] pattern = { 0, 100, 400 };
 
        // Vibrate for 300 milliseconds
        v.vibrate(pattern, 0);

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//        case android.R.id.home:
//            NavUtils.navigateUpFromSameTask(this);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
