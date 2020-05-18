package com.learning.dagger2.KSubComponentBuilder.di;

import com.learning.dagger2.KSubComponentBuilder.engineInterface.DieselEngine;
import com.learning.dagger2.KSubComponentBuilder.engineInterface.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public int provideHorsePower(){
        return horsePower;
    }
    @Provides
    public Engine providesDieselEngine(DieselEngine engine){
     return engine;
    }
}