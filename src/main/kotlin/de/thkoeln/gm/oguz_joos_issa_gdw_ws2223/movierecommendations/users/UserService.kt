package de.thkoeln.gm.movierecommendations.users

import java.util.*


interface UsersService {
    fun findById(id: UUID): User?
    fun getAllUser(): String
    fun existsById(userId: UUID): Boolean
    fun deleteById (userId: UUID)
    fun save (user: User):User
    fun findAll(): List<User>
}