package com.learning.dagger2.FruntimeValueInjection.di;


import com.learning.dagger2.FruntimeValueInjection.engineInterface.DieselEngine;
import com.learning.dagger2.FruntimeValueInjection.engineInterface.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }


    @Provides
    public Engine providesDieselEngine(){
        // We cant make it static as this method is dependent on member variable
//        we can also make a provide method for this horsepower if it is required other places aswell
        return new DieselEngine(horsePower);
    }
}
