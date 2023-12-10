package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import org.springframework.data.repository.findByIdOrNull
import java.util.*

class UsersServiceImpl (private val userRepository: UsersRepository) : UsersService {
    override fun findById(id: UUID): User? {
        return userRepository.findByIdOrNull(id)
    }

    override fun delete(user: User) {
        userRepository.delete(user)
    }

    override fun getAllUser(): String {
        return userRepository.findAll().toString()
    }

}