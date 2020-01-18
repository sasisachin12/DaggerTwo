package aaa.app.dagger.daggertwo.compontents


import aaa.app.dagger.daggertwo.MainActivity
import aaa.app.dagger.daggertwo.Modules.MobileModules
import aaa.app.dagger.daggertwo.accessories.MemoryCard
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MobileModules::class])
interface AppCompontent {

    var memoryCard: MemoryCard?

    fun inject(imp: MainActivity)
}