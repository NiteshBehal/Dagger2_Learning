package com.learning.dagger2.LComponentFactory.classesWeCantAccess;

public class Wheels {
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}