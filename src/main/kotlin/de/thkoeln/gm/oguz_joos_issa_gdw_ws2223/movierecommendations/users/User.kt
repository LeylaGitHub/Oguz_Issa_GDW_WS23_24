package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import org.hibernate.annotations.GenericGenerator
import java.util.*

// JPA entity class representing a User.
// Automatically generated UUID for the user.
// Users id, name, mail, age
// List of user's favorite movies.
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

    // Many-to-One relationship with the Movie entity.
    @ManyToOne
    var movie: Movie? = null

    override fun toString(): String {
        return "ID: $id, Name: $name, Mail: $mail, Age of the user: $age, Favourite Movies: $favouriteMovies"
    }
}