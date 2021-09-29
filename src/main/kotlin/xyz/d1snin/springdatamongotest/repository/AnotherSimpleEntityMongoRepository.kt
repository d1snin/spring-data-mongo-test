package xyz.d1snin.springdatamongotest.repository

import org.springframework.data.mongodb.repository.MongoRepository
import xyz.d1snin.springdatamongotest.entity.AnotherSimpleEntity

interface AnotherSimpleEntityMongoRepository : MongoRepository<AnotherSimpleEntity, String>