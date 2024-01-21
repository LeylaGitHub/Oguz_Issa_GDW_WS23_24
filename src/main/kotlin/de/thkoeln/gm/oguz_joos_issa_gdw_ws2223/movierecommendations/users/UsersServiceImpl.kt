package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import org.springframework.data.repository.findByIdOrNull
import java.util.*

class UsersServiceImpl (private val userRepository: UsersRepository) : UsersService {
    override fun findById(id: UUID): User? {
        return userRepository.findByIdOrNull(id)
    }

    override fun getAllUser(): String {
        return userRepository.findAll().toString()
    }

    override fun existsById(userId: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun deleteById(userId: UUID) {
        TODO("Not yet implemented")
    }

    override fun save(user: User): User {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<User> {
        TODO("Not yet implemented")
    }

}