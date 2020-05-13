package com.learning.dagger2.EprovidingInterfaceWithBind.di;



import com.learning.dagger2.EprovidingInterfaceWithBind.classesWeCantChange.Rims;
import com.learning.dagger2.EprovidingInterfaceWithBind.classesWeCantChange.Tires;
import com.learning.dagger2.EprovidingInterfaceWithBind.classesWeCantChange.Wheels;

import dagger.Module;
import dagger.Provides;

// Modules add objects to dependency graphs
@Module
public class WheelsModule {
    //==============Optimization===============
    // When these methods are not dependent on the instant state of module we can make them static to improve performance

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
