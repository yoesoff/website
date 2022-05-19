package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "addresses")
class Address () : BaseEntity() {

    @Column(name = "user_id")
    var userId: Long = 0

    @Column(name = "is_primary", nullable = false)
    var isPrimary: Boolean = false

    @Column(name = "address", nullable = false)
    var address: String = ""

    @Column(name = "city", nullable = false)
    var city: String = ""

    @Column(name = "state", nullable = false)
    var state: String = ""

    @Column(name = "postal", nullable = true)
    var postal: String = ""

    @Column(name = "latitude", nullable = true)
    var latitude: String = ""

    @Column(name = "longitude", nullable = true)
    var longitude: String = ""

}