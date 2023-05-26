package com.huythanh0x.springwithkotlin

import com.huythanh0x.springwithkotlin.entities.Article
import com.huythanh0x.springwithkotlin.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}