package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.NoSuchElementException

data class FavMovieDTO(
    val userId: UUID,
    val name: String,
)

@RestController
@RequestMapping("api/v4")
class FavoriteMoviesRestController (private val favoriteMoviesService: FavoriteMoviesService) {


    @GetMapping ("/favoriteMovies")
    fun getAll(): List<FavoriteMovie> {
        val favMovies = favoriteMoviesService.findAll()

        if (favMovies.isEmpty()) {
            throw NoSuchElementException ("No favorite Movie found.")
        }

        return favMovies
    }

    @PostMapping("/favoriteMovies")
    @ResponseStatus(HttpStatus.CREATED)
    fun createFavMovie(@RequestBody newFavMovie: FavoriteMovie) : FavoriteMovie {
        return favoriteMoviesService.save(newFavMovie)

    }


    @PatchMapping("/favoriteMovies/{movieId}")
    fun updateFavMovie(@PathVariable favMovieId: UUID, @RequestBody updateFavoriteMovie: FavoriteMovie) : FavoriteMovie {
        val existingFavMovie = favoriteMoviesService.findById(favMovieId) ?: throw NoSuchElementException()

        existingFavMovie.apply {
            name = updateFavoriteMovie.name
        }

        return favoriteMoviesService.save(existingFavMovie)
    }


    @GetMapping ("/favoriteMovies/{movieId}")
    fun getFavMovie (@PathVariable favMovieId: UUID) : FavMovieDTO {
        val favMovie = favoriteMoviesService.findById(favMovieId) ?: throw NoSuchElementException()

        return FavMovieDTO(favMovie.id, favMovie.name)
    }


    @DeleteMapping("/favoriteMovies/{movieId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteFavMovie (@PathVariable favMovieId: UUID) {
        if (!favoriteMoviesService.existsById(favMovieId)) {
            throw NoSuchElementException("Favorite Movie not found with ID: $id")
        }
        favoriteMoviesService.deleteById(favMovieId)
    }


}