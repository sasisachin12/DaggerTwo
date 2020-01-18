package aaa.app.matrimony.daggertwo.compontents

import aaa.app.matrimony.daggertwo.MainActivity

import aaa.app.matrimony.daggertwo.Modules.MobileModules
import aaa.app.matrimony.daggertwo.accessories.MemoryCard
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MobileModules::class])
interface AppCompontent {

    var memoryCard: MemoryCard?

    fun inject(imp: MainActivity)
}