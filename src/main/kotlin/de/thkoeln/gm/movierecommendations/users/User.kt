package de.thkoeln.gm.movierecommendations.users

import de.thkoeln.gm.movierecommendations.movies.Genre
import de.thkoeln.gm.movierecommendations.movies.Movie
import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.util.UUID

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


    @ManyToOne
    var movie: Movie? = null

    override fun toString(): String {
        return "ID: $id, Name: $name, Mail: $mail, Age of the user: $age, Favourite Genres: $favouriteGenres, Favourite Movies: $favouriteMovies"
    }
}