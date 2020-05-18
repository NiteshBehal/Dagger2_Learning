package com.learning.dagger2.JSubComponent;

import android.app.Application;

import com.learning.dagger2.JSubComponent.di.AppComponent;
import com.learning.dagger2.JSubComponent.di.DaggerAppComponent;


public class SubcomponentApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
