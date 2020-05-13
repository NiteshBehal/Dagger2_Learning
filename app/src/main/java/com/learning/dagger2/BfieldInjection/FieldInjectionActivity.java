package com.learning.dagger2.BfieldInjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;
import com.learning.dagger2.BfieldInjection.di.CarComponent;
import com.learning.dagger2.BfieldInjection.di.DaggerCarComponent;

import javax.inject.Inject;

public class FieldInjectionActivity extends AppCompatActivity {
    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_injection);
        CarComponent carComponent = DaggerCarComponent.create();
        // This will initialize all the variables of this activity marked with @Inject
        // and we don't need to call the provision methods for all the variables
        carComponent.inject(this);
        car.drive();
    }
}
