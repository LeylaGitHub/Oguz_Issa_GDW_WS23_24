package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import java.util.*

interface UsersService {
    fun findById(id: UUID): User?
    fun getAllUser(): String
    fun existsById(userId: UUID): Boolean
    fun deleteById (userId: UUID)
    fun save (user: User):User
    fun findAll(): List<User>
}