package de.thkoeln.gm.movierecommendations.favoriteMovies

import org.springframework.data.jpa.domain.AbstractPersistable_
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.NoSuchElementException

// Data class representing a DTO (Data Transfer Object) for Favorite Movies.
data class FavMovieDTO(
    val userId: UUID,
    val name: String,
)

@RestController
@RequestMapping("api/v4")
class FavoriteMoviesRestController (private val favoriteMoviesService: FavoriteMoviesService) {

    // Endpoint to get all favorite movies.
    @GetMapping("/favoriteMovies")
    fun getAll(): List<FavoriteMovie> {
        val favMovies = favoriteMoviesService.findAll()

        if (favMovies.isEmpty()) {
            // Throw an exception if no favorite movies are found.
            throw NoSuchElementException ("No favorite Movie found.")
        }

        return favMovies
    }

    // Endpoint to create a new favorite movie.
    @PostMapping("/favoriteMovies")
    @ResponseStatus(HttpStatus.CREATED)
    fun createFavMovie(@RequestBody newFavMovie: FavoriteMovie) : FavoriteMovie {
        return favoriteMoviesService.save(newFavMovie)

    }

    // Endpoint to update an existing favorite movie.
    @PatchMapping("/favoriteMovies/{movieId}")
    fun updateFavMovie(@PathVariable favMovieId: UUID, @RequestBody updateFavoriteMovie: FavoriteMovie) : FavoriteMovie {
        val existingFavMovie = favoriteMoviesService.findById(favMovieId) ?: throw NoSuchElementException()

        // Update the existing favorite movie with the provided data.
        existingFavMovie.apply {
            name = updateFavoriteMovie.name
        }

        return favoriteMoviesService.save(existingFavMovie)
    }

    // Endpoint to get details of a specific favorite movie.
    @GetMapping("/favoriteMovies/{movieId}")
    fun getFavMovie (@PathVariable favMovieId: UUID) : FavMovieDTO {
        val favMovie = favoriteMoviesService.findById(favMovieId) ?: throw NoSuchElementException()

        // Return a DTO containing selected details of the favorite movie.
        return FavMovieDTO(favMovie.id, favMovie.name)
    }

    // Endpoint to delete a favorite movie by ID.
    @DeleteMapping("/favoriteMovies/{movieId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteFavMovie (@PathVariable favMovieId: UUID) {
        // Throw an exception if the favorite movie with the given ID does not exist.
        if (!favoriteMoviesService.existsById(favMovieId)) {
            throw NoSuchElementException("Favorite Movie not found with ID: ${AbstractPersistable_.id}")
        }
        // Delete the favorite movie.
        favoriteMoviesService.deleteById(favMovieId)
    }


}