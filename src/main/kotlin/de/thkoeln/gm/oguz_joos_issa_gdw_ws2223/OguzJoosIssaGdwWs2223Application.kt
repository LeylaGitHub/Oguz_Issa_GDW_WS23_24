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

    /**
     * Zugriff auf die MCU API
     *
     */
    val apiURL = "https://www.whenisthenextmcufilm.com/"

    val client = HttpClient.newBuilder().build();
    val request  = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(apiURL))
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())



}

