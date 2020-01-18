package aaa.app.matrimony.daggertwo.accessories

import android.util.Log
import javax.inject.Inject

class MoviesAndSongs @Inject constructor() {


    private var moviesList = listOf(
        "Joker",
        "Escape Room",
        "Rust Creek",
        "A Dog's Way Home",
        "The Upside",
        "Replicas",
        "After Darkness",
        "Glass",
        "Close",
        "The Final Wish",
        "The Kid Who Would Be King",
        "Serenity", "Serenity",
        "Cold Pursuit",
        "High Flying Bird",
        "Maze Runner",
        "Perfume",
        "Triple Frontier",
        "Wonder Park",
        "Captive State",
        "Five Feet Apart",
        "Triple Threat",
        "Unplanned"
    )


    fun getSongsMovies(memoryCard: MemoryCard) {
        Log.e("MoviesAndSongs", " Searching MoviesAndSongs for copy to the memory card")
        val title = moviesList.random()
        memoryCard.songsOnMovies(title)
    }
}
