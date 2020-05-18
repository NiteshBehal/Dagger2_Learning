package com.learning.dagger2.ICustomScopesAndComponentDependencies;

import javax.inject.Inject;
import javax.inject.Singleton;

// ===== Lesson 1 === App Wide singleton
//@Singleton
//public class Driver {
//
//    @Inject
//    public Driver() {
//    }
//}

//==== Lesson 2 === Custom scope

public class Driver {
    //    We don't own this class so can't iuse any anotation in this class
    public Driver() {
    }
}