package de.thkoeln.gm.movierecommendations.favoriteMovies

import de.thkoeln.gm.movierecommendations.users.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import org.hibernate.annotations.GenericGenerator
import java.util.*

// JPA entity class representing a FavoriteMovie.
// Automatically generated UUID for the favorite movie.
// movie id, name

@Entity
class FavoriteMovie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var name: String = ""
}

// Many-to-One relationship with the user entity.
@ManyToOne
var user: User? = null