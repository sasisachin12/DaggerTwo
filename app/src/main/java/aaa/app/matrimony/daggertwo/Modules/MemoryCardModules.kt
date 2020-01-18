package aaa.app.matrimony.daggertwo.Modules

import aaa.app.matrimony.daggertwo.accessories.MemoryCard
import aaa.app.matrimony.daggertwo.accessories.MoviesAndSongs
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MemoryCardModules {

    @Provides
    @Singleton
    fun memoryMoviesAndSongsInfo(): MoviesAndSongs = MoviesAndSongs()


    @Provides
    @Singleton
    fun memoryCardInfo(): MemoryCard = MemoryCard()

}