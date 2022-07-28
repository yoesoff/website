package com.beanary.website.idm.entity

import com.beanary.website.entity.idm.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class User(

    @Column(name = "firstname", nullable = false)
    var firstname: String? = null,

    @Column(name = "middlename", nullable = false)
    var middlename: String? = null,

    @Column(name = "lastname", nullable = false)
    var lastname: String? = null

) : BaseEntity()