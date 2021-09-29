package xyz.d1snin.springdatamongotest

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataMongoTestApplication

fun main(args: Array<String>) {
    runApplication<SpringDataMongoTestApplication>(*args) {
        webApplicationType = WebApplicationType.NONE
    }
}
