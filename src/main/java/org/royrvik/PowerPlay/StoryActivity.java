package org.royrvik.PowerPlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;

public class StoryActivity extends Activity {

    private static int SPLASH_TIME_OUT = 10000;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.storyview);


                Intent i = new Intent(StoryActivity.this, StoryActivity2.class);
                startActivity(i);

    }
}