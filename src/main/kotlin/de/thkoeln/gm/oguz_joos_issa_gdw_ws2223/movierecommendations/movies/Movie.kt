package de.thkoeln.gm.movierecommendations.movies

import de.thkoeln.gm.movierecommendations.users.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.ManyToAny
import java.util.*

// JPA entity class representing a Movie.
// Automatically generated UUID for the movie.
// movie id, name, date of release, fsk, duration, genre
@Entity
class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var name: String = ""
    var dateOfRelease: Date = Date()
    var fsk: Int = 0
    var duration: Int = 0
    //    var genre: List<Genre> = listOf() //List<Genre> nicht möglich-->"Basic attribute type should not be a container"
    var genre: String = ""

    // Many-to-One relationship with the User entity.
    @ManyToOne
    var user: User? = null

    override fun toString(): String {
        return "ID: $id, Name: $name, Date of Release: $dateOfRelease, FSK: $fsk, Duration in min: $duration"
    }
}