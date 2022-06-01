package com.yeh35.noticebot

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloApi(
    private val textRepository: TextRepository
) {

    @RequestMapping("/hello")
    fun hello(): String {
        return "hello"
    }

    @RequestMapping("/echo/{text}")
    fun echo(@PathVariable text: String): String {
        val textEntity = textRepository.save(TextEntity(text))
        return textEntity.text
    }
}