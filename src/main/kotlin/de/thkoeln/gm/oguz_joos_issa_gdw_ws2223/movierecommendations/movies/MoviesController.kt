package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*

@Controller
class MoviesController (private val moviesService: MoviesService/*, private val usersService: UsersService*/)  {

    @PostMapping("/users/{userId}/movies")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    fun saveMovie(name: String, @PathVariable userId: UUID): String {
//        val user: User? = usersService.findById(userId)
        var movie = Movie()
        movie.name = name
        movie.dateOfRelease = Date()
        moviesService.favourise(movie)
        return movie.toString()
    }

    @GetMapping("/users/{userId}/movies")
    @ResponseBody
    fun getAllMovies(@PathVariable userId: UUID): String {
        TODO()
    }

    @GetMapping("/users/{userId}/movies/{id}")
    @ResponseBody
    fun getMovie(@PathVariable userId: UUID, @PathVariable id: UUID): String {
        TODO()
    }

    @DeleteMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteMovie(@PathVariable id: UUID) {
        TODO()
    }
}

