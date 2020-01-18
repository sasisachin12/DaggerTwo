package aaa.app.matrimony.daggertwo.Modules

import aaa.app.matrimony.daggertwo.accessories.Battery
import aaa.app.matrimony.daggertwo.accessories.Mobile
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MobileModules {

    @Provides
    @Singleton
    fun mobileinfo(imp:Battery): Mobile = Mobile(imp)

}