package org.royrvik.PowerPlay;

import android.app.Activity;
import android.os.Bundle;
import utils.ParseXML;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        double test = ParseXML.getLatestValue();
    }
}
