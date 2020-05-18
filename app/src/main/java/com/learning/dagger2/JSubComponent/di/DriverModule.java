package com.learning.dagger2.JSubComponent.di;

import com.learning.dagger2.JSubComponent.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Singleton
    @Provides
    static Driver getDriver(){
        return new Driver();
    }
}