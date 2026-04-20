package es.ujaen

import io.javalin.Javalin

fun main() {
    val app = Javalin.create { config ->
        config.routes.get("/") { ctx -> ctx.result("Hello, world!") }
    }.start(7070)
}
