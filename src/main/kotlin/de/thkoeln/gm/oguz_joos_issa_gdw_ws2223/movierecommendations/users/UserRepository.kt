package de.thkoeln.gm.movierecommendations.users

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UsersRepository : CrudRepository<User, UUID> {

}