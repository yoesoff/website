package com.beanary.website

import io.sentry.Sentry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsiteApplication

fun main(args: Array<String>) {
    runApplication<WebsiteApplication>(*args)

    try {
        throw Exception("This is a test.")
    } catch (e: Exception) {
        Sentry.captureException(e)
    }
}
