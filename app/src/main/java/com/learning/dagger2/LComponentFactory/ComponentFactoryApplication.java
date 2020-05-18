package com.learning.dagger2.LComponentFactory;

import android.app.Application;

import com.learning.dagger2.LComponentFactory.di.AppComponent;
import com.learning.dagger2.LComponentFactory.di.DaggerAppComponent;
import com.learning.dagger2.LComponentFactory.di.DriverModule;

public class ComponentFactoryApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create(new DriverModule("Joey"));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}