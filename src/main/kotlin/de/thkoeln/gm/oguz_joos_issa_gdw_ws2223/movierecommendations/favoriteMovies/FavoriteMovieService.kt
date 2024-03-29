package de.thkoeln.gm.movierecommendations.favoriteMovies

import java.util.*

// Interface defining the operations for Favorite Movies.
interface FavoriteMoviesService {
    fun findAll(): List<FavoriteMovie>
    fun save (favoriteMovie: FavoriteMovie): FavoriteMovie
    fun findById(favMovieId: UUID): FavoriteMovie?
    fun existsById(favMovieId: UUID): Boolean
    fun deleteById (favMovieId: UUID)

}