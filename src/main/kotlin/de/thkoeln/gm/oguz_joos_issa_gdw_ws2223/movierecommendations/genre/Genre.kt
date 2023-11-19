package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.genre

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class Genre {
    @Id
    var id: UUID = UUID.randomUUID()
}