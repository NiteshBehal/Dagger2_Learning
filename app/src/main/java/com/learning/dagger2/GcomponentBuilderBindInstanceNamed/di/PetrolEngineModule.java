package com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di;

import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.engineInterface.Engine;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}