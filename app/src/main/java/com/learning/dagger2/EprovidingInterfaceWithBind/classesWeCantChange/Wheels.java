package com.learning.dagger2.EprovidingInterfaceWithBind.classesWeCantChange;

/**
 * Suppose we cant change this class i.e this class is not our class but of sum library that we don't own.
 * For this reason we can't place @Inject annotation on it's constructor.
 */
public class Wheels {
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
