package com.learning.dagger2.CmethodInjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;
import com.learning.dagger2.CmethodInjection.di.CarComponent;
import com.learning.dagger2.CmethodInjection.di.DaggerCarComponent;

import javax.inject.Inject;

public class MethodInjectionActivity extends AppCompatActivity {
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
