package org.royrvik.PowerPlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button playbutton, settingsButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.main);

        playbutton = (Button) findViewById(R.id.playButton);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playbutton.setBackgroundResource(R.drawable.btnnewgame);
                Intent i = new Intent(MainActivity.this, StoryActivity.class);
                startActivity(i);
            }
        });

        playbutton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                playbutton.setBackgroundResource(R.drawable.btnnewgamedown);
                return false;
            }
        });

        settingsButton = (Button) findViewById(R.id.settingsButton);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingsButton.setBackgroundResource(R.drawable.btnsettings);
                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });


        settingsButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                settingsButton.setBackgroundResource(R.drawable.btnsettingsdown);
                return false;
            }
        });

        //double test = ParseXML.getLatestValue();
        //Log.d("APP", Double.toString(test));
    }
}
