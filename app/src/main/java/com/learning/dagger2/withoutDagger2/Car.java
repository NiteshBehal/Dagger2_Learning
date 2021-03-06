package com.learning.dagger2.withoutDagger2;

import android.util.Log;

public class Car {
    private static final String TAG = "Dagger2_Learning";
    private Engine engine;
    private Wheels wheels;

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "drive: driving...");
    }
}
