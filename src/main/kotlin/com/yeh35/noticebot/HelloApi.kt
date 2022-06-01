package com.yeh35.noticebot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/hello")
@RestController
class HelloApi {

    @RequestMapping
    fun hello(): String {
        return "hello"
    }

}