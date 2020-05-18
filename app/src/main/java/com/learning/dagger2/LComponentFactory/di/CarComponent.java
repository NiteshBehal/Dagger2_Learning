package com.learning.dagger2.LComponentFactory.di;

import com.learning.dagger2.LComponentFactory.ComponentFactoryActivity;
import com.learning.dagger2.LComponentFactory.di.scope.PerActivityScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivityScope
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    void inject(ComponentFactoryActivity activity);

//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
//
//        CarComponent build();
//    }

    @Subcomponent.Factory
    interface Factory {
        CarComponent create(@BindsInstance @Named("horsePower") int horsePower,
                            @BindsInstance @Named("engineCapacity") int engineCapacity);
    }

}