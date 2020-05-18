package com.learning.dagger2.LComponentFactory;

public class Driver {

    String driverName;
    //    We don't own this class so can't iuse any anotation in this class

    public Driver(String driverName) {
        this.driverName = driverName;
    }
}