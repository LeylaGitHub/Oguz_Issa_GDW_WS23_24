package de.thkoeln.gm.movierecommendations.favoriteMovies

import de.thkoeln.gm.movierecommendations.users.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface FavoriteMovieRespository : CrudRepository<User, UUID> {

}