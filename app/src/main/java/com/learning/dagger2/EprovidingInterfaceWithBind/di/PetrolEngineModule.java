package com.learning.dagger2.EprovidingInterfaceWithBind.di;

import com.learning.dagger2.EprovidingInterfaceWithBind.engineInterface.Engine;
import com.learning.dagger2.EprovidingInterfaceWithBind.engineInterface.PetrolEngine;

import dagger.Binds;
import dagger.Module;
//
//@Module
//public class PetrolEngineModule {
//
//    @Provides
//    public Engine providesPetrolEngine(PetrolEngine petrolEngine)
//    {
//        return petrolEngine;
//    }
//}


// ====== MoreOptimized way =====


@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);
}