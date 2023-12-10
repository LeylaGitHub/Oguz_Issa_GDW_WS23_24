package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.UsersService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Controller
class MoviesController (private val moviesService: MoviesService, private val usersService: UsersService)  {

    @PostMapping("/users/{userId}/movies")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    fun saveMovie(name: String, @PathVariable userId: UUID): String {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            val movie = Movie()
            movie.name = name
            movie.user = user
            moviesService.favourise(movie)
            return movie.toString()
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }

    @GetMapping("/users/{userId}/movies")
    @ResponseBody
    fun getAllMovies(@PathVariable userId: UUID): String {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            val movies: List<Movie> = moviesService.getAllFavByUser(user)
            return movies.joinToString("|")
        } else {
            throw ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/users/{userId}/movies/{id}")
    @ResponseBody
    fun getMovie(@PathVariable userId: UUID, @PathVariable id: UUID): String {
        val movie = moviesService.findById(id)
        val user: User? = usersService.findById(userId)

        if(movie != null && user != null) {
            if (user.id != movie.user?.id) {
                throw ResponseStatusException(HttpStatus.FORBIDDEN)
            }
            return movie.toString()
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }

    @DeleteMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteMovie(@PathVariable id: UUID) {
        TODO()
    }
}

