package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import org.springframework.data.repository.findByIdOrNull
import java.util.*

abstract class MoviesServiceImpl (private val moviesRepository: MoviesRepository) : MoviesService {
    override fun findById(id: UUID): Movie? {
        return moviesRepository.findByIdOrNull(id)
    }

    override fun getAllMovies(): List<Movie> {
        return moviesRepository.findAll().toList()
    }

    override fun findByGenre(genre: String): List<Movie> {
        return moviesRepository.findByGenre(genre)
    }

    override fun generateMovie(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun updateMovie(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun save(movie: Movie) {
        moviesRepository.save(movie)
    }

    override fun delete(movie: Movie) {
        moviesRepository.delete(movie)
    }
}