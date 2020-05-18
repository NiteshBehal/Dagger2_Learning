package com.learning.dagger2.ICustomScopesAndComponentDependencies;

import android.app.Application;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.AppComponent;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.CarComponent;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.DaggerAppComponent;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.DaggerCarComponent;

public class CustomScopeAndComponentDependencyApplication extends Application {
// ===== Lesson 1 = App wide singleton
//    private CarComponent carComponent;

    //    ===== Lesson 2 == Ciustom Scope
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // ===== Lesson 1 = App wide singleton
//        We have moved our component initialization in this application class so that it will get created only once
//        and the single objects can be Application wide singleton
//        carComponent = DaggerCarComponent
//                .builder()
//                .horsePower(100)
//                .engineCapacity(1000)
//                .build();

        //    ===== Lesson 2 == Ciustom Scope
        appComponent = DaggerAppComponent.create();

    }

    // ===== Lesson 1 = App wide singleton
//    public CarComponent getAppCarComponent()
//    {
////        exposed the Car component to All the activities
//        return carComponent;
//    }

    // ===== Lesson 2 = Custom Scope
    public AppComponent getAppComponent() {
//        exposed the App component to All the activities
        return appComponent;
    }
}
