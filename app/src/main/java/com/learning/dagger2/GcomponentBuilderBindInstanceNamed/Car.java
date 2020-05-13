package com.learning.dagger2.GcomponentBuilderBindInstanceNamed;

import android.util.Log;

import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.classesWeCantChange.Wheels;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.engineInterface.Engine;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Dagger2_Learning";
    @Inject public Engine engine;
    private Wheels wheels;

    //Fields and method injection automatically works when we do constructor injwction
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        //Method injection is used when we need to iass the injected object itself to it's dependency
        // here Remote class require car's object
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "Method InjectionWorking: driving...");
    }
}
