package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface FavoriteMovieRespository : CrudRepository<User, UUID> {

}