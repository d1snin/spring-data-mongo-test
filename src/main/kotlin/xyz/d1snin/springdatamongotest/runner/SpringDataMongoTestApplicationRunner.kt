package xyz.d1snin.springdatamongotest.runner

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import xyz.d1snin.springdatamongotest.entity.AnotherSimpleEntity
import xyz.d1snin.springdatamongotest.entity.SimpleEntity
import xyz.d1snin.springdatamongotest.repository.AnotherSimpleEntityMongoRepository
import xyz.d1snin.springdatamongotest.repository.SimpleEntityMongoRepository

@Component
class SpringDataMongoTestApplicationRunner @Autowired constructor(
    val simpleEntityMongoRepository: SimpleEntityMongoRepository,
    val anotherSimpleEntityMongoRepository: AnotherSimpleEntityMongoRepository
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        simpleEntityMongoRepository.save(
            SimpleEntity("One").apply {
                anotherEntities = anotherSimpleEntityMongoRepository.saveAll(
                    listOf(
                        AnotherSimpleEntity("One"),
                        AnotherSimpleEntity("Two"),
                        AnotherSimpleEntity("Three")
                    )
                )
            }
        )

        println(simpleEntityMongoRepository.findAll())
    }
}