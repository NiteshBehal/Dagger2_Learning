package com.learning.dagger2.JSubComponent;

import android.os.Bundle;
import android.util.Log;

import com.learning.dagger2.JSubComponent.di.CarComponent;
import com.learning.dagger2.JSubComponent.di.DieselEngineModule;
import com.learning.dagger2.R;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;



public class SubComponentActivity extends AppCompatActivity {
    @Inject
    public Car car, car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component);

        CarComponent carComponent = ((SubcomponentApplication)getApplication()).getAppComponent().getCarComponent(new DieselEngineModule(210));
        carComponent.inject(this);
        car.drive();
        car2.drive();

    }
}
