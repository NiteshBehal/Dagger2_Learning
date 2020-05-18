package com.learning.dagger2.ICustomScopesAndComponentDependencies.di;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.engineInterface.Engine;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}