package com.learning.dagger2.KSubComponentBuilder.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    // This is called a fectory method.
    // Now we don't need to call provision method for each module but the subcomponents will get access all the modules automatically.
    // If we have multiple dependencies we will add them as a parameter here.
    CarComponent.Builder getCarComponentBuilder();

}