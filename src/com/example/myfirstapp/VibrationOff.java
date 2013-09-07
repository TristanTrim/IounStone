package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Vibrator;

public class VibrationOff extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);

        // Turn of vibration
        v.cancel();

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
