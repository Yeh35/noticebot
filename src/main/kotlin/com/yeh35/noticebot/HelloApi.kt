package com.yeh35.noticebot

import org.jboss.logging.Logger
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloApi(
    private val textRepository: TextRepository
) {

    private val logger = Logger.getLogger(this::class.java)

    @RequestMapping("/hello")
    fun hello(@RequestBody body: String): String {
        logger.info("hello")
        logger.info("Body: $body")
        return "hello"
    }

    @RequestMapping("/echo/{text}")
    fun echo(@PathVariable text: String): String {
        val textEntity = textRepository.save(TextEntity(text))
        return textEntity.text
    }
}