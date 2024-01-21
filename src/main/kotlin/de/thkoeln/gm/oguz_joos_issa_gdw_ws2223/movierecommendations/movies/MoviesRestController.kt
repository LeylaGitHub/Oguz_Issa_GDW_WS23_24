package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.UsersService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("api/v1")
class MoviesRestController(private val moviesService: MoviesService) {

    @GetMapping("/movies")
    @ResponseBody
    fun getAllMovies(): List<Movie> {
        val movies: List<Movie> = moviesService.getAllMovies()
        if (movies.isEmpty())
            throw ResponseStatusException(HttpStatus.NOT_FOUND)
        return movies
    }

    @GetMapping("/movies/{id}")
    @ResponseBody
    fun getMovie(@PathVariable id: UUID): Movie {
        val movie = moviesService.findById(id)
        if(movie != null) {
            return movie
        } else {
            throw NoSuchElementException("Movie not found.")
        }
    }

    @PostMapping("/movies")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    fun generateMovie(@RequestBody newMovie: Movie) {
        return moviesService.save(newMovie)
    }

    @PatchMapping("/movies/{id}")
    fun updateMovie(@PathVariable id: UUID): Movie {
        val movie = moviesService.findById(id)
        if(movie != null) {
            return movie
        } else {
            throw NoSuchElementException("Movie not found. Could not be updated.")
        }
    }

    @DeleteMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteMovie(@PathVariable id: UUID) {
        val movie: Movie? = moviesService.findById(id)

        if (movie != null) {
            moviesService.delete(movie)
        } else {
            throw NoSuchElementException("Movie not found. Could not be deleted.")
        }
    }

/*    @PostMapping("/users/{userId}/movies")
    fun favorise(id: UUID, @PathVariable userId: UUID): Movie {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            val movie = Movie()
            movie.id = id
            movie.user = user
            moviesService.favorise(movie)
            return movie
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }*/
}
