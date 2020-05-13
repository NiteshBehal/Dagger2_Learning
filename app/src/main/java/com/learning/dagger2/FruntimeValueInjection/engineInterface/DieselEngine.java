package com.learning.dagger2.FruntimeValueInjection.engineInterface;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "Dagger2_Learning";
    private int horsePower;

    public DieselEngine(int horsePower) {
//        We cant inject this constructor as we want to pass a dynamic value for horsepower
//        so removed @Inject annotation from here
//        another way of doing it is in next module starting with G
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine And Horsepower is " + horsePower);
    }
}
