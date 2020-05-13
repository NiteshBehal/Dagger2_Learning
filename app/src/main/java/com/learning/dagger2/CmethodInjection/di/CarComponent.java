package com.learning.dagger2.CmethodInjection.di;

import com.learning.dagger2.CmethodInjection.MethodInjectionActivity;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(MethodInjectionActivity activity);

}
