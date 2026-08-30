package com.neba.fullyhome;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends Activity {
    private static final String FULLY_PACKAGE = "de.ozerov.fully";
    private static final String FULLY_ACTIVITY = "de.ozerov.fully.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchFully();
    }

    @Override
    protected void onResume() {
        super.onResume();
        launchFully();
    }

    private void launchFully() {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(FULLY_PACKAGE, FULLY_ACTIVITY));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                           Intent.FLAG_ACTIVITY_CLEAR_TOP |
                           Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        } catch (Exception ignored) {
        }
    }
}
