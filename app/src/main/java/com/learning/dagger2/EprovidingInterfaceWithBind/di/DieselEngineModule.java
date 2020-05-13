package com.learning.dagger2.EprovidingInterfaceWithBind.di;

import com.learning.dagger2.EprovidingInterfaceWithBind.engineInterface.DieselEngine;
import com.learning.dagger2.EprovidingInterfaceWithBind.engineInterface.Engine;

import dagger.Binds;
import dagger.Module;

//@Module
//public class DieselEngineModule {
//
//    @Provides
//    public Engine providesDieselEngine(DieselEngine dieselEngine)
//    {
//        return dieselEngine;
//    }
//}
//
//// ====== MoreOptimized way =====


@Module
public abstract class DieselEngineModule {

    @Binds
    public abstract Engine bindsDieselEngine(DieselEngine dieselEngine);
}
