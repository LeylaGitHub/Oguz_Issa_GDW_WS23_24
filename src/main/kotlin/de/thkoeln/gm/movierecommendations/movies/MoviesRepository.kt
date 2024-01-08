import de.thkoeln.gm.movierecommendations.movies.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MoviesRepository : CrudRepository<Movie, UUID> {

}