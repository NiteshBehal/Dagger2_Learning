package com.learning.dagger2.KSubComponentBuilder;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Dagger2_Learning";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: remote connected method injection");

    }
}