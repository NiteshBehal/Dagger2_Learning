package com.learning.dagger2.JSubComponent.di;

import com.learning.dagger2.JSubComponent.SubComponentActivity;
import com.learning.dagger2.JSubComponent.di.scope.PerActivityScope;
import com.learning.dagger2.JSubComponent.engineInterface.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivityScope
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(SubComponentActivity activity);

}