package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.favoriteMovies

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users.User
import jakarta.persistence.OneToOne
import java.util.*

@Entity
class FavoriteMovie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var name: String = ""
    var content: MutableList<FavoriteMovie> = mutableListOf()

    @OneToOne
    var user: User? = null
}