package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import java.util.*

interface UsersService {
    fun findById(id: UUID): User?
    fun saveUser (user: User)
    fun getAllUser(): String
    fun getUserById  (id: UUID): User
}