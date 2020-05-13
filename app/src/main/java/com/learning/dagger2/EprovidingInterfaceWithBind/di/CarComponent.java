package com.learning.dagger2.EprovidingInterfaceWithBind.di;

import com.learning.dagger2.EprovidingInterfaceWithBind.InterfaceWithBindActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    void inject(InterfaceWithBindActivity activity);

}
