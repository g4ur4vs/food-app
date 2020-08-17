package com.xcalibure.foodapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *Created by gaurav13.singh on Aug, 2020
 **/

@RestController
class Controller {

    @GetMapping("/test")
    fun test(): String {
        return "Hello"
    }

}