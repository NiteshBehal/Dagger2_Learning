package com.learning.dagger2.KSubComponentBuilder.di;

import com.learning.dagger2.KSubComponentBuilder.engineInterface.Engine;
import com.learning.dagger2.KSubComponentBuilder.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}