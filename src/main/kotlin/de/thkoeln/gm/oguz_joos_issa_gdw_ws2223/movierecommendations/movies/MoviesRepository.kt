import de.thkoeln.gm.movierecommendations.movies.Movie
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MoviesRepository : CrudRepository<Movie, UUID> {
    fun findByFsk() : List<Movie>
    fun findByGenre(genre: String) : List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.fsk = 0 ")
    fun getAllByFsk0() : List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.fsk = 6 ")
    fun getAllByFsk6() : List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.fsk = 12 ")
    fun getAllByFsk12() : List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.fsk = 16 ")
    fun getAllByFsk16() : List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.fsk = 18 ")
    fun getAllByFsk18() : List<Movie>
}