package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping


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