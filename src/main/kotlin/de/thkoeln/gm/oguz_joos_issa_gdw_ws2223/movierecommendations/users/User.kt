package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.genre.Genre
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import java.util.*

@Entity
class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var name: String = ""
    var mail: String = ""
    var age: Int = 0
    var favouriteMovies: MutableList<Movie> = mutableListOf()
    var favouriteGenres: MutableList<Genre> = mutableListOf()

}