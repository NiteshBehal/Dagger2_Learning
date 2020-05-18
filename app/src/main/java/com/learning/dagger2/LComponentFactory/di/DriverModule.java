package com.learning.dagger2.LComponentFactory.di;

import com.learning.dagger2.LComponentFactory.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Singleton
    @Provides
     Driver getDriver(){
        return new Driver(driverName);
    }
}