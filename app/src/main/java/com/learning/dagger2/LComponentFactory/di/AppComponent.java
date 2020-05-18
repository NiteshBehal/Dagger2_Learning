package com.learning.dagger2.LComponentFactory.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    // This is called a fectory method.
    // Now we don't need to call provision method for each module but the subcomponents will get access all the modules automatically.
    // If we have multiple dependencies we will add them as a parameter here.
    CarComponent.Factory getCarComponentFactory();

    @Component.Factory
    interface Factory {

        AppComponent create(DriverModule driverModule);

//        if our AppComponent has a dependency on any other component we will pass it as an argument aswell like we did in I package. i.e
//        AppComponent create(DriverModule driverModule, CarComponent carComponent);

    }

}