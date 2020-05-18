package com.learning.dagger2.JSubComponent.di;

import com.learning.dagger2.JSubComponent.classesWeCantChange.Rims;
import com.learning.dagger2.JSubComponent.classesWeCantChange.Tires;
import com.learning.dagger2.JSubComponent.classesWeCantChange.Wheels;

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