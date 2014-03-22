package org.royrvik.PowerPlay;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import static android.app.PendingIntent.getActivity;

/**
 * Created by rikardeide on 22/3/14.
 */
public class SettingsActivity extends Activity{

    private Button backbutton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.settingviewq);

    backbutton = (Button) findViewById(R.id.backbutton);

    backbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            backbutton.setBackgroundResource(R.drawable.btnback);
            Intent i = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(i);
         }

    });

        backbutton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                backbutton.setBackgroundResource(R.drawable.btnbackdown);
                return false;
            }
        });






    }







}
