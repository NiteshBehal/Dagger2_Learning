package com.learning.dagger2.LComponentFactory.di;

import com.learning.dagger2.LComponentFactory.engineInterface.Engine;
import com.learning.dagger2.LComponentFactory.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}