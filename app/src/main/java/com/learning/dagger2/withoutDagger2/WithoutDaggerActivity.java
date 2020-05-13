package com.learning.dagger2.withoutDagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.R;

public class WithoutDaggerActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_dagger);
        Engine engine = new Engine();
        Wheels wheels = new Wheels();
        car = new Car(engine, wheels);
        car.drive();
    }
}
