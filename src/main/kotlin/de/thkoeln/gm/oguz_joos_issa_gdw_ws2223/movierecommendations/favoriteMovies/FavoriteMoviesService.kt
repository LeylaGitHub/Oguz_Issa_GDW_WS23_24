package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import java.util.*

interface FavoriteMoviesService {
    fun findAll(): List<FavoriteMovie>
    fun save (favoriteMovie: FavoriteMovie): FavoriteMovie
    fun findById(favMovieId: UUID): FavoriteMovie?
    fun existsById(favMovieId: UUID): Boolean
    fun deleteById (favMovieId: UUID)

}