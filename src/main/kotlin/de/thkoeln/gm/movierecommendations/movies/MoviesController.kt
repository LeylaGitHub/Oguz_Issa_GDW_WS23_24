package de.thkoeln.gm.movierecommendations.movies

import de.thkoeln.gm.movierecommendations.users.User
import de.thkoeln.gm.movierecommendations.users.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

class MoviesController : UserService {
    override fun saveUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun getAllUser(): String {
        TODO("Not yet implemented")
    }

    override fun getUserById(id: UUID): User {
        TODO("Not yet implemented")
    }

    /**
     * Test
     * @GetMapping("/users")
     * @ResponseBody
     * fun getAllUsers(): String {
     *
        var users = userService.getAllUsers()
        return users.joinToString(,)
    }
     */
}