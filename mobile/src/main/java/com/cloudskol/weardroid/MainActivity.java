package com.cloudskol.weardroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Main entry point for the mobile application
 *
 * http://stackoverflow.com/questions/25205888/pairing-android-and-wear-emulators
 * https://kennethmascarenhas.wordpress.com/2014/08/19/developing-for-android-wear-with-emulators/
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
