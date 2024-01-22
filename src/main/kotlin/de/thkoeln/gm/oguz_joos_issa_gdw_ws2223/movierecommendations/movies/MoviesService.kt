package de.thkoeln.gm.movierecommendations.movies

import java.util.*

// Interface defining the operations for Movies.
interface MoviesService {
    fun findById(id: UUID): Movie?
    fun getAllMovies(): List<Movie>
    fun findByGenre(genre: String): List<Movie>
    fun generateMovie(movie: Movie)
    fun updateMovie(movie: Movie)
    fun save(movie:Movie)
    fun delete(movie: Movie)
}