package com.beanary.website.idm.repo

import com.beanary.website.idm.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepo: CrudRepository<User, Long> {
    override fun findById(id: Long): Optional<User>

    override fun findAll(): List<User>
}