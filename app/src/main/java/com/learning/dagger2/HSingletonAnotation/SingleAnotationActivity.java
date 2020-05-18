package com.learning.dagger2.HSingletonAnotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learning.dagger2.HSingletonAnotation.di.CarComponent;
import com.learning.dagger2.HSingletonAnotation.di.DaggerCarComponent;
import com.learning.dagger2.R;

import javax.inject.Inject;

public class SingleAnotationActivity extends AppCompatActivity {

    @Inject
    public Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_injection);

//        Put @Singeton annotation on the class we want to make singletone in this case DriverClass
//        and also we need to put @Singeton annotation on our CarComponent.
//        This is not the true form of singleton as the drive object is only singletone for a single component not applicartion wide.
//        To make the class object application wide singleton we need to initialize the component once in Application class and set the custome scope over there.
//        This will be discussed in next package. Here in this case if you will create another component or rotate the screen driver object will get a new instance.
        CarComponent carComponent = DaggerCarComponent
                .builder()
                .horsePower(100)
                .engineCapacity(1000)
                .build();
        carComponent.inject(this);
        car.drive();
        car2.drive();
    }
}
