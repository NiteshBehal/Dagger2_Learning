package com.learning.dagger2.ICustomScopesAndComponentDependencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.CarComponent;
import com.learning.dagger2.ICustomScopesAndComponentDependencies.di.DaggerCarComponent;
import com.learning.dagger2.R;

import javax.inject.Inject;

public class CustomScopesAndComponentDependenciesActivity extends AppCompatActivity {

    @Inject
    public Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_injection);
        // ==== Lesson 1 == Application wide scope
//        Getting the car component from Application class.
//        So now we will get the single instance for Driver everytime as long as the application is alive
//        CarComponent carComponent = ((CustomScopeAndComponentDependencyApplication)getApplication()).getAppCarComponent();
//        carComponent.inject(this);
//        car.drive();
//        car2.drive();

        // ==== Lesson 2 == Custom scope

//                CarComponent carComponent = ((CustomScopeAndComponentDependencyApplication)getApplication()).getAppCarComponent();
        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1000)
                .appComponent(((CustomScopeAndComponentDependencyApplication)getApplication()).getAppComponent())
                .build();
        carComponent.inject(this);
        car.drive();
        car2.drive();
    }
}
