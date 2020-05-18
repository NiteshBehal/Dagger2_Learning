package com.learning.dagger2.KSubComponentBuilder.di;

import com.learning.dagger2.KSubComponentBuilder.SubComponentBuilderActivity;
import com.learning.dagger2.KSubComponentBuilder.di.scope.PerActivityScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivityScope
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    void inject(SubComponentBuilderActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }

}