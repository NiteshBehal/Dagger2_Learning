package com.learning.dagger2.FruntimeValueInjection.di;


import com.learning.dagger2.FruntimeValueInjection.RuntimeValueInjection;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(RuntimeValueInjection activity);

}
