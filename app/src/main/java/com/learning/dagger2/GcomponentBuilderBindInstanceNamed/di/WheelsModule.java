package com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di;

import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.classesWeCantChange.Rims;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.classesWeCantChange.Tires;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.classesWeCantChange.Wheels;

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