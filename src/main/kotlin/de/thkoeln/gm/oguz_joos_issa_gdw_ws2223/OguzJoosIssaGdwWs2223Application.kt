package de.thkoeln.gm.oguz_joos_issa_gdw_ws2223

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

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
}
