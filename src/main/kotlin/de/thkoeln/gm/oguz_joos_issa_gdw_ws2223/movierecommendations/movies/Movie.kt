package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import java.util.*

class Movie {

    var name: String = ""

    var dateOfRelease: Date = Date()

    override fun toString(): String {
        return "Name: $name, Date of Release: $dateOfRelease"
    }
}