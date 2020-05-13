package com.learning.dagger2.DmoduleAndProvider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;
import com.learning.dagger2.DmoduleAndProvider.di.CarComponent;
import com.learning.dagger2.DmoduleAndProvider.di.DaggerCarComponent;

import javax.inject.Inject;

public class ModuleAndProviderActivity extends AppCompatActivity {
    @Inject
    public Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_injection);
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}
