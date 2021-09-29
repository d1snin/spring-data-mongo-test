package xyz.d1snin.springdatamongotest.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class AnotherSimpleEntity(val name: String) {

    @Id
    lateinit var id: String
}