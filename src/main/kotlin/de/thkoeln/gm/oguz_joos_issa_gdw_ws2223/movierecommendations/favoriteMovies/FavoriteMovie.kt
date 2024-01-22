package de.thkoeln.gm.movierecommendations.favoriteMovies

import de.thkoeln.gm.movierecommendations.users.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import org.hibernate.annotations.GenericGenerator
import java.util.*

@Entity
class FavoriteMovie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    // Automatically generated UUID for the movie.
    var id: UUID = UUID.randomUUID()
    var name: String = ""
}

@ManyToOne
var user: User? = null