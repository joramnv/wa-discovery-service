package com.sparetimedevs.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class WaDiscoveryServiceApplication

fun main(args: Array<String>) {
    runApplication<WaDiscoveryServiceApplication>(*args)
}
