package com.learning.dagger2.GcomponentBuilderBindInstanceNamed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di.CarComponent;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di.DaggerCarComponent;
import com.learning.dagger2.GcomponentBuilderBindInstanceNamed.di.DieselEngineModule;
import com.learning.dagger2.R;

import javax.inject.Inject;

public class ComponentBuilderBindInstanceNamedActivity extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_injection);

//         Need to use builder() inplace of create when we have to pass dynamic values
//        this is how we inject statue into module to inject it to our dependency graph
        CarComponent carComponent = DaggerCarComponent
                .builder()
                .horsePower(100)
                .engineCapacity(1000)
                .build();
        carComponent.inject(this);
        car.drive();
    }
}
