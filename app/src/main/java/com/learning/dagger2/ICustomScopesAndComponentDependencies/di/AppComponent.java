package com.learning.dagger2.ICustomScopesAndComponentDependencies.di;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    //    Provision Method
//    We have to explicitly expose this driver object using provesion method. if we don't do this our project won't compile anymore.
//    And for multiple such modules, multiple Provision Method will be created
    Driver getDriver();
}
