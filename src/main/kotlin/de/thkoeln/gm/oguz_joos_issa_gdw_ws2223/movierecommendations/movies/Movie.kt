package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import java.util.*

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
//    var genre: Genre


    override fun toString(): String {
        return "ID: $id, Name: $name, Date of Release: $dateOfRelease, FSK: $fsk, Duration in min: $duration"
    }
}