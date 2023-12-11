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
class MoviesRestController(private val usersService: UsersService, private val moviesService: MoviesService) {

    @PostMapping("/users/{userId}/movies")
    @ResponseStatus(HttpStatus.CREATED)
    fun favouriseMovie(id: UUID, @PathVariable userId: UUID): Movie {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            val movie = Movie()
            movie.id = id
            movie.user = user
            moviesService.favourise(movie)
            return movie
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }

    @GetMapping("/users/{userId}/movies")
    fun getFavMoviesList(@PathVariable userId: UUID) : List<Movie> {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            return moviesService.getAllFavByUser(user)
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }

    @GetMapping("/users/{userId}/movies")
    fun getMovie(@PathVariable userId: UUID, @PathVariable id: UUID) : Movie {
        val user: User? = usersService.findById(userId)
        val movie = moviesService.findById(id)

        if(movie != null && user != null){

            if(user.id != movie.user?.id) {
                throw ResponseStatusException(HttpStatus.FORBIDDEN)
            }
            return movie
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }
}
