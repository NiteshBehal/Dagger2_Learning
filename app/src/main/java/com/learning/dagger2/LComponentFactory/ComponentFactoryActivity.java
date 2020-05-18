package com.learning.dagger2.LComponentFactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.LComponentFactory.di.CarComponent;
import com.learning.dagger2.R;

import javax.inject.Inject;

public class ComponentFactoryActivity  extends AppCompatActivity {

    @Inject
    public Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component);

        CarComponent carComponent = ((ComponentFactoryApplication) getApplication())
                .getAppComponent()
                .getCarComponentFactory()
                .create(500, 1900);
        carComponent.inject(this);
        car.drive();
        car2.drive();

    }
}
