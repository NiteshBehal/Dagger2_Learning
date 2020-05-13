package com.learning.dagger2.AconstructorInjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;
import com.learning.dagger2.AconstructorInjection.di.CarComponent;
import com.learning.dagger2.AconstructorInjection.di.DaggerCarComponent;

public class ConstructorInjectionActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_injection);

        //We Need DaggerComponent for activities and fragments as we don't have constructors for
        // these because we don't create these objects ourselves
        // For multiple variables we have to create multiple provision methods and have to call them here.
        // This is the drawback of ConstructorInjection in case of activities as be lack constructor.
        // So for such cases field injection is recommended.
        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();
    }
}
