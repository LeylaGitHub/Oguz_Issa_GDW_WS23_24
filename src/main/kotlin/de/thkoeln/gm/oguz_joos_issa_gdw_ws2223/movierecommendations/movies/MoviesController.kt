package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*
import kotlin.NoSuchElementException


data class MovieDTO(
    val movieId: UUID,
    val name: String,
)
@Controller
@RequestMapping("/movies")
class MoviesController (private val moviesService: MoviesService) {


}

