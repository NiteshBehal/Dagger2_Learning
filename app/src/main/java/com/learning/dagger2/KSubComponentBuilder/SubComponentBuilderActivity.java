package com.learning.dagger2.KSubComponentBuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.KSubComponentBuilder.di.CarComponent;
import com.learning.dagger2.KSubComponentBuilder.di.DieselEngineModule;
import com.learning.dagger2.R;

import javax.inject.Inject;

public class SubComponentBuilderActivity extends AppCompatActivity {

    @Inject
    public Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component);

        CarComponent carComponent = ((SubcomponentBuilderApplication) getApplication())
                .getAppComponent()
                .getCarComponentBuilder()
                .engineCapacity(1500)
                .horsePower(240)
                .build();
        carComponent.inject(this);
        car.drive();
        car2.drive();

    }
}
