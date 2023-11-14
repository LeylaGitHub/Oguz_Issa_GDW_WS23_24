package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import java.util.*

class MoviesServiceImpl (private val moviesRepository: MoviesRepository) : MoviesService {
    override fun findById(id: UUID): Movie? {
        TODO("Not yet implemented")
    }

    override fun findAllMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override fun delete(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun favourise(movie: Movie) {
        TODO("Not yet implemented")
    }
}