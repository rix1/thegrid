package org.royrvik.PowerPlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class EndActivity extends Activity {

    private Button endviewbackbutton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.endview);

        endviewbackbutton = (Button) findViewById(R.id.endviewbackbutton);

        endviewbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endviewbackbutton.setBackgroundResource(R.drawable.btnback);
                Intent i = new Intent(EndActivity.this, MainActivity.class);
                startActivity(i);
            }

        });

        endviewbackbutton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                endviewbackbutton.setBackgroundResource(R.drawable.btnbackdown);
                return false;
            }
        });

    }
}