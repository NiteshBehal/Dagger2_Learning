package com.learning.dagger2.KSubComponentBuilder.di;


import com.learning.dagger2.KSubComponentBuilder.Driver;

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