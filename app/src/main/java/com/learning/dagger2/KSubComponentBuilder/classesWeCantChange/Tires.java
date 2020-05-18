package com.learning.dagger2.KSubComponentBuilder.classesWeCantChange;

import android.util.Log;

public class Tires {
    private static final String TAG = "Dagger2_Learning";
    /**
     * Suppose we cant change this class i.e this class is not our class but of sum library that we don't own.
     * For this reason we can't place @Inject annotation on it's constructor.
     */

    public void inflate(){
        // Method to do some configuration.
        Log.d(TAG, "configurating tires to inflate");
    }
}