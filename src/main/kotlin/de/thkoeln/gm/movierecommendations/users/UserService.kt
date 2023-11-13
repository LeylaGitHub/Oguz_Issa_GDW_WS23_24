package de.thkoeln.gm.movierecommendations.users

import java.util.*

interface UserService {
    fun saveUser (user: User)
    fun  getAllUser(): List<User>
    fun getUserById  (id: UUID): User
}