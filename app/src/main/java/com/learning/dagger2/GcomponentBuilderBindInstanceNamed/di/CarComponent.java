package com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di;

import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.ComponentBuilderBindInstanceNamedActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    void inject(ComponentBuilderBindInstanceNamedActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }

}