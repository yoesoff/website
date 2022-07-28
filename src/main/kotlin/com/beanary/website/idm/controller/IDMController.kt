package com.beanary.website.idm.controller

import com.beanary.website.idm.entity.Address
import com.beanary.website.idm.entity.User
import com.beanary.website.idm.repo.AddressRepo
import com.beanary.website.idm.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/idm/api/v1")
class IDMController {

    @Autowired
    lateinit var userRepo: UserRepo

    @Autowired
    lateinit var addressRepo: AddressRepo

    @GetMapping("")
    fun helloWorld(): String {
        return "It's your IDM home buddy!"
    }

    @Transactional
    @PostMapping("/register")
    fun register(): String {
        val user: User = userRepo.save(User("Joni", "Budi", "Setiawan"))
        addressRepo.save(Address(user.id, true, "Jalan waas no. 09", "Bandung", "Jawa Barat", "65387"))
        return "It's your IDM register home buddy!"
    }

}