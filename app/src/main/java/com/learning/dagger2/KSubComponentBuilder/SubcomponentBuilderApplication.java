package com.learning.dagger2.KSubComponentBuilder;

import android.app.Application;

import com.learning.dagger2.KSubComponentBuilder.di.AppComponent;
import com.learning.dagger2.KSubComponentBuilder.di.DaggerAppComponent;

public class SubcomponentBuilderApplication extends Application {
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
