package com.learning.dagger2.EprovidingInterfaceWithBind.engineInterface;

import android.util.Log;

import javax.inject.Inject;


public class DieselEngine implements Engine {
    private static final String TAG = "Dagger2_Learning";
    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine");
    }
}
