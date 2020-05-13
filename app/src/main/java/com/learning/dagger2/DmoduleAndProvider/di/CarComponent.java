package com.learning.dagger2.DmoduleAndProvider.di;

import com.learning.dagger2.DmoduleAndProvider.ModuleAndProviderActivity;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {

    void inject(ModuleAndProviderActivity activity);

}
