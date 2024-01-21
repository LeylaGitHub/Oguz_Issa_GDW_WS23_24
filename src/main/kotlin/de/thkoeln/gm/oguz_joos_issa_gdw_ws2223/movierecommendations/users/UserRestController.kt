package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.Movie
import de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies.MoviesService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.NoSuchElementException

data class UserDTO(
    val userId: UUID,
    val mail: String,
    val name: String
)

@RestController
@RequestMapping("api/v4")
class UserRestController (private val usersService: UsersService) {
    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: UUID): UserDTO {
        val user = usersService.findById(userId) ?: throw NoSuchElementException()

        return UserDTO(user.id, user.mail, user.name)
    }

    @PostMapping (("/user"))
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser (@RequestBody newUser: User) : User {
        return usersService.save(newUser)
    }

    @PatchMapping ("/user/{userId}")
    fun updateUser(@PathVariable userId: UUID, @RequestBody updatedUser: User): User {
        val existingUser = usersService.findById(userId) ?: throw NoSuchElementException()

        existingUser.apply {
            name = updatedUser.name
            mail = updatedUser.mail
        }

        return usersService.save(existingUser)
    }

    @GetMapping ("/users")
    fun getAllUsers(): List<UserDTO> {
        val users = usersService.findAll()

        if (users.isEmpty()) {
            throw NoSuchElementException("No users found.")
        }

        return users.map { user -> UserDTO(user.id, user.mail, user.name) }
    }

    @DeleteMapping("/user/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable userId: UUID) {
        if (!usersService.existsById(userId)) {
            throw NoSuchElementException("User not found with ID: $userId")
        }
        usersService.deleteById(userId)
    }

}