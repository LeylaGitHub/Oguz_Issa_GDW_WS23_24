package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.genre.Genre
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
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

    override fun getAllFavByUser(user: User): List<Movie> {
        return moviesRepository.findByFavUser(user).toList()
    }

    override fun delete(movie: Movie) {
        moviesRepository.delete(movie)
    }

    override fun favourise(movie: Movie) {
        moviesRepository.save(movie)
    }
}