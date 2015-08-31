package com.proggroup.ndktest;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {


    // load the library - name matches jni/Android.mk
    static {
        System.loadLibrary("ndkfoo");
    }

    // declare the native code function - must match ndkfoo.c
    public native String invokeNativeFunction();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this is where we call the native code
        String hello = invokeNativeFunction();

        new AlertDialog.Builder(this).setMessage(hello).show();
    }
}
