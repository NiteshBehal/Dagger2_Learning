package com.learning.dagger2.JSubComponent.di;

import com.learning.dagger2.JSubComponent.engineInterface.Engine;
import com.learning.dagger2.JSubComponent.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}