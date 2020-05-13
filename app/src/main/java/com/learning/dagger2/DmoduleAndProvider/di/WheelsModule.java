package com.learning.dagger2.DmoduleAndProvider.di;

import com.learning.dagger2.DmoduleAndProvider.classesWeCantChange.Rims;
import com.learning.dagger2.DmoduleAndProvider.classesWeCantChange.Tires;
import com.learning.dagger2.DmoduleAndProvider.classesWeCantChange.Wheels;

import dagger.Module;
import dagger.Provides;

// Modules add objects to dependency graphs
//@Module
//public class WheelsModule {

//    @Provides
//    Rims provideRims() {
//        return new Rims();
//    }
//
//    @Provides
//    Tires provideTires() {
//        Tires tires = new Tires();
//        tires.inflate();
//        return tires;
//    }
//
//    @Provides
//    Wheels provideWheels(Rims rims, Tires tires) {
//        return new Wheels(rims, tires);
//    }

//}




    //==============Optimization===============
    // When these methods are not dependent on the instant state of module we can make them static to improve performance
    // We can add abstract to our class to make sure no one ads nonstatic methods here
    @Module
    public abstract class WheelsModule {
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
