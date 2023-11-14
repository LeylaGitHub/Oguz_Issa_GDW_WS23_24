package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223.movierecommendations.movies

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MoviesRepository : CrudRepository<Movie, UUID> {

}