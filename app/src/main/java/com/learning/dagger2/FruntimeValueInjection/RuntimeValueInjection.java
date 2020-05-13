package com.learning.dagger2.FruntimeValueInjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;
import com.learning.dagger2.FruntimeValueInjection.di.CarComponent;
import com.learning.dagger2.FruntimeValueInjection.di.DaggerCarComponent;
import com.learning.dagger2.FruntimeValueInjection.di.DieselEngineModule;

import javax.inject.Inject;

public class RuntimeValueInjection extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_injection);

//         Need to use builder() inplace of create when we have to pass dynamic values
//        this is how we inject statue into module to inject it to our dependency graph
        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        carComponent.inject(this);
        car.drive();
    }
}
