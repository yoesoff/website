package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.MappedSuperclass

@MappedSuperclass
class BaseEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @Column(name = "updated_at", updatable = false)
    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime
}