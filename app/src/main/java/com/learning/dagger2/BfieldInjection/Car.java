package com.learning.dagger2.BfieldInjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Dagger2_Learning";
    @Inject public Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "Field InjectionWorking: driving...");
    }
}
