package com.learning.dagger2.AconstructorInjection.di;

import com.learning.dagger2.AconstructorInjection.Car;

import dagger.Component;

// Component interface is the main part of dagger which act as an injector
@Component
public interface CarComponent {

    //    this is called as Provision method, just a getter method
    //    this will generate the Car object by constructor injection
    Car getCar();
}
