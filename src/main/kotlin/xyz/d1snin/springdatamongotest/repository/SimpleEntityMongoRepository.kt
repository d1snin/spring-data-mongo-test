package xyz.d1snin.springdatamongotest.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import xyz.d1snin.springdatamongotest.entity.SimpleEntity

@Repository
interface SimpleEntityMongoRepository : MongoRepository<SimpleEntity, String>