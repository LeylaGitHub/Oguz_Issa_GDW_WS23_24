package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

@Controller
class MoviesController {

    @GetMapping("/movies")
    @ResponseBody
    fun saveMovie(name: String): String {
        var movie: Movie = Movie()
        movie.name = name
        movie.dateOfRelease = Date()
        return movie.toString()
    }
}