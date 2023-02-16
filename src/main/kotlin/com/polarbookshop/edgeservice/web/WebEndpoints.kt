package com.polarbookshop.edgeservice.web

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.web.reactive.function.server.*


@Configuration
class WebEndpoints {
    @Bean
    fun routerFunction2(): RouterFunction<ServerResponse> = coRouter {
        GET("/catalog-fallback") { ServerResponse.ok().bodyValueAndAwait("") }
        POST("/catalog-fallback") { ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE).buildAndAwait() }
    }
}