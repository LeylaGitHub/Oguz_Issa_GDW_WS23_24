package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@SpringBootApplication
class OguzJoosIssaGdwWs2223Application

@Controller
class GreetingsController {
    @GetMapping("/")
    @ResponseBody
    fun sayHelloWorld(): String {
        return "Hello World"
    }
}

/**
 * "When is the next MCU film?"
 * */
fun main(args: Array<String>) {
    runApplication<OguzJoosIssaGdwWs2223Application>(*args)

    // Beispiel für https://www.whenisthenextmcufilm.com/
    // -- in Bearbeitung --
    val mcuApiURL = "https://www.whenisthenextmcufilm.com/"

    val mcuClient = HttpClient.newHttpClient()
    val mcuRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(mcuApiURL))
        .build()

    val mcuResponse = mcuClient.send(mcuRequest, HttpResponse.BodyHandlers.ofString())
    println("API-Antwort für MCU: ${mcuResponse.body()}")

    // Beispiel für https://imdb-api.com/en/API/Title/k_12345678/tt1375666
    // -- in Bearbeitung --

    val apiKey = "dc7d9197471301b4662f3e024d3643d6"
    val imdbId = "tt1375666" // IMDb-ID des gesuchten Films

    val imdbApiURL = "https://imdb-api.com/en/API/Title/k_$apiKey/$imdbId"

    val imdbClient = HttpClient.newHttpClient()
    val imdbRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(imdbApiURL))
        .build()

    val imdbResponse = imdbClient.send(imdbRequest, HttpResponse.BodyHandlers.ofString())
    println("API-Antwort für IMDb: ${imdbResponse.body()}")

    /**
     * TMDB
     * GET favorite Movies
    val client = HttpClient.newHttpClient()

    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.themoviedb.org/3/account/20640413/favorite/movies?language=en-US&page=1&sort_by=created_at.asc"))
        .GET()
        .header("accept", "application/json")
        .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJkYzdkOTE5NzQ3MTMwMWI0NjYyZjNlMDI0ZDM2NDNkNiIsInN1YiI6IjY1M2U2N2M0MTA5Y2QwMDEyY2ZmYjhlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.t6ia58yXiAVCVFHiha1yLCEzUT8EJOE48SbWpOrKC4E")
        .build()

    var response = client.send(request, HttpResponse.BodyHandlers.ofString())


    */

    /** Response bei obiger GET_Anfrage
    {
        "page": 1,
        "results": [
        {
            "adult": false,
            "backdrop_path": "/t9rOTMHcE26MqcTSRF1LUicsY5b.jpg",
            "genre_ids": [
            16,
            35,
            10751
            ],
            "id": 1075794,
            "original_language": "en",
            "original_title": "Leo",
            "overview": "Jaded 74-year-old lizard Leo has been stuck in the same Florida classroom for decades with his terrarium-mate turtle. When he learns he only has one year left to live, he plans to escape to experience life on the outside but instead gets caught up in the problems of his anxious students — including an impossibly mean substitute teacher.",
            "popularity": 637.2,
            "poster_path": "/pD6sL4vntUOXHmuvJPPZAgvyfd9.jpg",
            "release_date": "2023-11-17",
            "title": "Leo",
            "video": false,
            "vote_average": 7.529,
            "vote_count": 814
        },
        {
            "adult": false,
            "backdrop_path": "/rLb2cwF3Pazuxaj0sRXQ037tGI1.jpg",
            "genre_ids": [
            18,
            36
            ],
            "id": 872585,
            "original_language": "en",
            "original_title": "Oppenheimer",
            "overview": "The story of J. Robert Oppenheimer's role in the development of the atomic bomb during World War II.",
            "popularity": 703.156,
            "poster_path": "/8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg",
            "release_date": "2023-07-19",
            "title": "Oppenheimer",
            "video": false,
            "vote_average": 8.118,
            "vote_count": 6105
        }
        ],
        "total_pages": 1,
        "total_results": 2
    }

    */
}
