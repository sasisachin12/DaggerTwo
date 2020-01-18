package aaa.app.dagger.daggertwo.Modules


import aaa.app.dagger.daggertwo.accessories.MemoryCard
import aaa.app.dagger.daggertwo.accessories.MoviesAndSongs
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