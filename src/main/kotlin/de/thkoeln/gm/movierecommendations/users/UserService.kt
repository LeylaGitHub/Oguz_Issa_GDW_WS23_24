package de.thkoeln.gm.movierecommendations.users

import java.util.*


interface UsersService {
    fun findById(id: UUID): User?
    fun delete(user: User)
    fun getAllUser(): String
}