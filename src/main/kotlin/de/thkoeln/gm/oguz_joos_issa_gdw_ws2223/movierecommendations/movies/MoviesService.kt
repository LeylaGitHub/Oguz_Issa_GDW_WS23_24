package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.genre.Genre
import java.util.*

interface MoviesService {
    fun findById(id: UUID): Movie?
    fun findAllMovies(): List<Movie>
    fun findByGenre(genre: Genre): List<Movie>
    fun delete(movie: Movie)
    fun favourise(movie: Movie)
}