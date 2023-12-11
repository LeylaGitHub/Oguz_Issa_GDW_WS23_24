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
    val imdbId = "tt1375666" //  IMDb-ID des gesuchten Films

    val imdbApiURL = "https://imdb-api.com/en/API/Title/k_$apiKey/$imdbId"

    val imdbClient = HttpClient.newHttpClient()
    val imdbRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(imdbApiURL))
        .build()

    val imdbResponse = imdbClient.send(imdbRequest, HttpResponse.BodyHandlers.ofString())
    println("API-Antwort für IMDb: ${imdbResponse.body()}")

}

