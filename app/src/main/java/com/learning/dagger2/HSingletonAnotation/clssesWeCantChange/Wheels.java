package com.learning.dagger2.HSingletonAnotation.clssesWeCantChange;

public class Wheels {
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}