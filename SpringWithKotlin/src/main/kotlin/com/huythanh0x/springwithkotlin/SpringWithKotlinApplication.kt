package com.huythanh0x.springwithkotlin

import com.huythanh0x.springwithkotlin.properties.BlogProperties
import com.huythanh0x.springwithkotlin.entities.Article
import com.huythanh0x.springwithkotlin.entities.User
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringWithKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringWithKotlinApplication>(*args)
}

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
        articleRepository.save(
            Article(
                title = "Lorem",
                headline = "Lorem",
                content = "dolor sit amet",
                author = johnDoe
            )
        )
        articleRepository.save(
            Article(
                title = "Ipsum",
                headline = "Ipsum",
                content = "dolor sit amet",
                author = johnDoe
            )
        )
    }
}