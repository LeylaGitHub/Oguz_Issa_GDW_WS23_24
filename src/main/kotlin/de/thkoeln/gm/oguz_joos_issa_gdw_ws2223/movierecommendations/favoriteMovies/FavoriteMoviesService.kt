package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie

interface FavoriteMoviesService {
    fun findByMovieId(favoriteMovie: FavoriteMovie)
    fun getAllFavByUser(favoriteMovies: FavoriteMovie)
    fun favourise(movie: Movie)
    fun updateFavMov(favoriteMovie: FavoriteMovie)
    fun delete(favoriteMovie: FavoriteMovie)
}