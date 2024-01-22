package de.thkoeln.gm.movierecommendations.movies

import de.thkoeln.gm.movierecommendations.users.User
import de.thkoeln.gm.movierecommendations.users.UsersService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*


data class MovieDTO(
    val movieId: UUID,
    val name: String,
)
@Controller
@RequestMapping("/movies")
class MoviesController (private val moviesService: MoviesService) {


}