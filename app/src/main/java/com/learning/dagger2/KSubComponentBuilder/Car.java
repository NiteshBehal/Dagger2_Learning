package com.learning.dagger2.KSubComponentBuilder;

import android.util.Log;

import com.learning.dagger2.KSubComponentBuilder.classesWeCantChange.Wheels;
import com.learning.dagger2.KSubComponentBuilder.di.scope.PerActivityScope;
import com.learning.dagger2.KSubComponentBuilder.engineInterface.Engine;

import javax.inject.Inject;

@PerActivityScope
public class Car {
    private static final String TAG = "Dagger2_Learning";
    @Inject public Engine engine;
    private Wheels wheels;
    private Driver driver;

    //Fields and method injection automatically works when we do constructor injwction
    @Inject
    public Car(Wheels wheels, Driver driver) {
        this.wheels = wheels;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        //Method injection is used when we need to iass the injected object itself to it's dependency
        // here Remote class require car's object
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver + " Drives " + this);
    }
}