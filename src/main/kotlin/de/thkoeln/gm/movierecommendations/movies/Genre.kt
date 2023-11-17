package de.thkoeln.gm.movierecommendations.movies

import jakarta.persistence.Entity

@Entity
class Genre {
    var genres = listOf("Action", "Comedy", "Thriller", "Drama", "Fantasy", "Science-Fiction")
}