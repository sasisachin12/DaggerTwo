package aaa.app.dagger.daggertwo.Modules

import aaa.app.dagger.daggertwo.accessories.Battery
import aaa.app.dagger.daggertwo.accessories.Mobile

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MobileModules {

    @Provides
    @Singleton
    fun mobileinfo(imp: Battery): Mobile = Mobile(imp)

}