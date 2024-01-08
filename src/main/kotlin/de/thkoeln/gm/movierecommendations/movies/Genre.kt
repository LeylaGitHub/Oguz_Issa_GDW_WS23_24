package de.thkoeln.gm.movierecommendations.movies

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class Genre {
    @Id
    var id: UUID = UUID.randomUUID()
}