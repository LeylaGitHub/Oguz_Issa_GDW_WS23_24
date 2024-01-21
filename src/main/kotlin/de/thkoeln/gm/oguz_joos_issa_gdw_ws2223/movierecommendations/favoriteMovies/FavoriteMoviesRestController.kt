package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.UsersService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class FavoriteMoviesRestController (private val favoriteMoviesService: FavoriteMoviesService, private val usersService: UsersService) {

    @GetMapping("/favoriteMovies")
    fun getFavMovies(@PathVariable userId: UUID) {
        val user: User? = usersService.findById(userId)
        if(user != null) {
            return favoriteMoviesService.
        } else {
            throw ChangeSetPersister.NotFoundException()
        }
    }

    @PostMapping("/users/{userId}/movies")
    fun
}