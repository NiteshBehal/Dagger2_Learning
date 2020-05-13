package com.learning.dagger2.AconstructorInjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Dagger2_Learning";
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "Constructor Injection Working: driving...");
    }
}
