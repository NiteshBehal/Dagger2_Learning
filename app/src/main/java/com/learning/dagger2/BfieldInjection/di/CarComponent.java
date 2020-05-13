package com.learning.dagger2.BfieldInjection.di;

import com.learning.dagger2.BfieldInjection.FieldInjectionActivity;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(FieldInjectionActivity activity);

}
