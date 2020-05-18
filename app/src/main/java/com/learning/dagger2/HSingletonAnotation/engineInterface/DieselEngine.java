package com.learning.dagger2.HSingletonAnotation.engineInterface;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Dagger2_Learning";
    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
//        We cant inject this constructor as we want to pass a dynamic value for horsepower
//        so removed @Inject annotation from here
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine And Horsepower is " + horsePower);
    }
}