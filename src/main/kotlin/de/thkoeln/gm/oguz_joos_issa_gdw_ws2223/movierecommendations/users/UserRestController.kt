package de.thkoeln.gm.movierecommendations.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.NoSuchElementException

// data class for User, to filter relevant information.
data class UserDTO(
    val userId: UUID,
    val mail: String,
    val name: String
)

// Marks the class as a Spring REST controller.
@RestController
@RequestMapping("api/v4")
class UserRestController (private val usersService: UsersService) {

    // Handles HTTP GET requests for retrieving a specific user by ID.
    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: UUID): UserDTO {
        val user = usersService.findById(userId) ?: throw NoSuchElementException()

        // Maps the user entity to a UserDTO for response.
        return UserDTO(user.id, user.mail, user.name)
    }

    // Handles HTTP POST requests for creating a new user.
    @PostMapping (("/user"))
    // Sets the HTTP response status to 201 Created.
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser (@RequestBody newUser: User) : User {
        return usersService.save(newUser)
    }

    // Handles HTTP PATCH requests to update an existing user.
    @PatchMapping ("/user/{userId}")
    fun updateUser(@PathVariable userId: UUID, @RequestBody updatedUser: User): User {
        // Gets the existing user by ID or throws an exception if not found.
        val existingUser = usersService.findById(userId) ?: throw NoSuchElementException()

        // Updates the existing user with the provided data.
        existingUser.apply {
            name = updatedUser.name
            mail = updatedUser.mail
        }
        // Saves the updated user and returns the saved instance.
        return usersService.save(existingUser)
    }

    // Handles HTTP GET requests to get all users.
    @GetMapping ("/users")
    fun getAllUsers(): List<UserDTO> {
        val users = usersService.findAll()

        if (users.isEmpty()) {
            // Throws an exception if no users are found.
            throw NoSuchElementException("No users found.")
        }

        return users.map { user -> UserDTO(user.id, user.mail, user.name) }
    }

    // Handles HTTP DELETE requests to delete a user by ID.
    @DeleteMapping("/user/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable userId: UUID) {
        // Throws an exception if the user with the given ID does not exist.
        if (!usersService.existsById(userId)) {
            throw NoSuchElementException("User not found with ID: $userId")
        }
        // Delete the user.
        usersService.deleteById(userId)
    }

}