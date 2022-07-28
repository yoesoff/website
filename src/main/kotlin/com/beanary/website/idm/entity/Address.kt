package com.beanary.website.idm.entity

import com.beanary.website.entity.idm.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "addresses")
class Address(

    @Column(name = "user_id")
    var userId: Long? = null,

    @Column(name = "is_primary", nullable = false)
    var isPrimary: Boolean,

    @Column(name = "address", nullable = false)
    var address: String,

    @Column(name = "city", nullable = false)
    var city: String,

    @Column(name = "state", nullable = false)
    var state: String,

    @Column(name = "postal", nullable = true)
    var postal: String = ""
) : BaseEntity()