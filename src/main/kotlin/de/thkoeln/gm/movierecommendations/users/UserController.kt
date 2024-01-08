package de.thkoeln.gm.movierecommendations.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

// UserController muss überarbeitet werden

@Controller
@RequestMapping("/users")
class UsersController {

    private val users = mutableListOf<User>()

    @PostMapping
    fun addUser (@RequestBody user: User) : ResponseEntity<String> {
        users.add(user)
        val response = "Benutzer hinzugefügt: $user"
        return ResponseEntity(response, HttpStatus.CREATED)
    }

    @GetMapping
    fun getAllUsers() : ResponseEntity<List<User>>{
        return ResponseEntity(users, HttpStatus.OK)
    }

}