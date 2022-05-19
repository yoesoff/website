package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

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