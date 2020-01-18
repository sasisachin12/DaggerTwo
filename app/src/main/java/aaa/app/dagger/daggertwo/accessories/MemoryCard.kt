package aaa.app.dagger.daggertwo.accessories

import android.util.Log
import javax.inject.Inject


class MemoryCard @Inject constructor() {

    private var songsMovies: String? = null


    //Method Injection
    @Inject
    fun addSongsMoviesOnMemoryCard(songsMovies: MoviesAndSongs) {
        Log.e("MemoryCard", " MemoryCard  opened")
        songsMovies.getSongsMovies(this)
    }


    fun songsOnMovies(title: String) {
        this.songsMovies = title
        Log.e("MemoryCard", " SongsAndMovies processing on MemoryCard")
    }


    fun getSongsOnMovies(): String {
        Log.e("MemoryCard", " SongsAndMovies  ** "+this.songsMovies.toString()+" ** copied MemoryCard")
        Log.e("MemoryCard", " Memory card attached in Mobile")
        return this.songsMovies.toString()

    }


}