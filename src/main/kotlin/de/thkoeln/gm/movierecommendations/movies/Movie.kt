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

@Entity
class Movie {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2")
    var id: UUID = UUID.randomUUID()
    var name: String = ""
    var dateOfRelease: Date = Date()
    var fsk: Int = 0
    var duration: Int = 0
    var genre: Genre = Genre()

    /**
    @ManyToOne
    var user = User? = null
    */

}
