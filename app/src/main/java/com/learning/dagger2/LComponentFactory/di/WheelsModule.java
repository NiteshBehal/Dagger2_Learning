package com.learning.dagger2.LComponentFactory.di;

import com.learning.dagger2.LComponentFactory.classesWeCantAccess.Rims;
import com.learning.dagger2.LComponentFactory.classesWeCantAccess.Tires;
import com.learning.dagger2.LComponentFactory.classesWeCantAccess.Wheels;

import dagger.Module;
import dagger.Provides;

// Modules add objects to dependency graphs
@Module
public class WheelsModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}