package com.learning.dagger2.ICustomScopesAndComponentDependencies.engineInterface;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Dagger2_Learning";
    private int horsePower;
    private int enigneCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int enigneCapacity) {
        this.horsePower = horsePower;
        this.enigneCapacity = enigneCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: PetrolEngine "
                + "\nHorsePower : " + horsePower
                + "\nenigneCapacity : " + enigneCapacity
        );
    }
}