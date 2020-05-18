package com.learning.dagger2.HSingletonAnotation.di;

import com.learning.dagger2.HSingletonAnotation.engineInterface.Engine;
import com.learning.dagger2.HSingletonAnotation.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}