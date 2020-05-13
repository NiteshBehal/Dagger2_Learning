package com.learning.dagger2.FruntimeValueInjection.di;



import com.learning.dagger2.FruntimeValueInjection.engineInterface.Engine;
import com.learning.dagger2.FruntimeValueInjection.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}