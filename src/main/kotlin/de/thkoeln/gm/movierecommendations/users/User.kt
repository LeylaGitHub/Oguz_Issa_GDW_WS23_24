package de.thkoeln.gm.movierecommendations.users

import de.thkoeln.gm.movierecommendations.movies.Genre
import de.thkoeln.gm.movierecommendations.movies.Movie
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import org.hibernate.annotations.GenericGenerator
import java.util.UUID

@Entity
class User {
    @Id
    @GeneratedValue (generator = "uuid2")
    @GenericGenerator (name ="uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var email: String = ""
    var password: String = ""
    var age: Int = 0
    @OneToMany
    var movieList: MutableList<Movie> = mutableListOf()
    var favouriteGenres : MutableList<Genre> = mutableListOf()




}