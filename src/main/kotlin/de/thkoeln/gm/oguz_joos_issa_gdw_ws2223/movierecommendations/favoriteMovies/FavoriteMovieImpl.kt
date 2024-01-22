package de.thkoeln.gm.movierecommendations.favoriteMovies

import java.util.*

// Abstract class implementing FavoriteMoviesService interface
abstract class FavoriteMovieController (private val favoriteMoviesService: FavoriteMoviesService) : FavoriteMoviesService{

    override fun findAll(): List<FavoriteMovie> {
        return favoriteMoviesService.findAll().toList()
    }
    override fun save (favoriteMovie: FavoriteMovie): FavoriteMovie {
        return favoriteMoviesService.save(favoriteMovie)
    }
    override fun findById(favMovieId: UUID): FavoriteMovie? {
        return favoriteMoviesService.findById(favMovieId)
    }
    override fun existsById(favMovieId: UUID): Boolean {
        return favoriteMoviesService.existsById(favMovieId)
    }
    override fun deleteById (favMovieId: UUID){
        return favoriteMoviesService.deleteById(favMovieId)
    }

}