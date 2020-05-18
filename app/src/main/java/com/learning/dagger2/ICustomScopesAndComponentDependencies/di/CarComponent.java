package com.learning.dagger2.ICustomScopesAndComponentDependencies.di;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.CustomScopesAndComponentDependenciesActivity;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.scope.PerActivityScope;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


// ====== Lesson 1 AppWideScope Lesson
//@Singleton
//@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
//public interface CarComponent {
//
//    void inject(CustomScopesAndComponentDependenciesActivity activity);
//
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
//
//        CarComponent build();
//    }
//
//}

//====== Lesson 2 Custom Scope Lesson
@PerActivityScope
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
// this dependencies keyword tells us that this component require AppComponent to build.
public interface CarComponent {

    void inject(CustomScopesAndComponentDependenciesActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        // When we add dependencies and have custom builder like this we need to add builder like this.
        // If we don't have component builder, this method will get generated automatically.
        Builder appComponent(AppComponent appComponent);

        CarComponent build();
    }

}