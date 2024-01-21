package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import java.util.*

interface MoviesService {
    fun findById(id: UUID): Movie?
    fun getAllMovies(): List<Movie>
    fun findByGenre(genre: String): List<Movie>
    fun generateMovie(movie: Movie)
    fun updateMovie(movie: Movie)
    fun save(movie:Movie)
    fun delete(movie: Movie)
}