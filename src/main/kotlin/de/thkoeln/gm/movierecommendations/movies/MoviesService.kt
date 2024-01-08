package de.thkoeln.gm.movierecommendations.movies

import java.util.*

interface MoviesService {
    fun findById(id: UUID): Movie?
    fun findAllMovies(): List<Movie>
    fun findByGenre(genre: Genre): List<Movie>
    fun delete(movie: Movie)
    fun favourise(movie: Movie)
}