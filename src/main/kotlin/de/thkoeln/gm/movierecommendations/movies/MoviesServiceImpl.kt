package de.thkoeln.gm.movierecommendations.movies

import MoviesRepository
import org.springframework.data.repository.findByIdOrNull
import java.util.*

class MoviesServiceImpl (private val moviesRepository: MoviesRepository) : MoviesService {
    override fun findById(id: UUID): Movie? {
        return moviesRepository.findByIdOrNull(id)
    }

    override fun findAllMovies(): List<Movie> {
        return moviesRepository.findAll().toList()
    }

    override fun findByGenre(genre: Genre): List<Movie> {
        return findAllMovies().filter { TODO() }.toList()
    }

    override fun delete(movie: Movie) {
        moviesRepository.delete(movie)
    }

    override fun favourise(movie: Movie) {
        moviesRepository.save(movie)
    }
}