package com.beanary.website.idm.repo

import com.beanary.website.idm.entity.Address
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AddressRepo: CrudRepository<Address, Long> {

    override fun findById(id: Long): Optional<Address>

    override fun findAll(): List<Address>
}