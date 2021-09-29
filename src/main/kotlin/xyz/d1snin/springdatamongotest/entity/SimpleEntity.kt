package xyz.d1snin.springdatamongotest.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document
class SimpleEntity(
    val name: String
) {

    @Id
    lateinit var id: String

    @DBRef
    lateinit var anotherEntities: List<AnotherSimpleEntity>

    override fun toString(): String {
        return "SimpleEntity(name='$name', id='$id')"
    }
}