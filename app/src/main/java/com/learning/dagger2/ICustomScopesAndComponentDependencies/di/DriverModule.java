package com.learning.dagger2.ICustomScopesAndComponentDependencies.di;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// ==== Lesson 2 custom Scope ==
@Module
public abstract class DriverModule {
    @Singleton
    @Provides
    static Driver getDriver(){
        return new Driver();
    }
}
