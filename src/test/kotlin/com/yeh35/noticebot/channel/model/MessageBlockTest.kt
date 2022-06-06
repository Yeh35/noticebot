package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.databind.ObjectMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class MessageBlockTest {

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @Test
    fun serializeTest() {
        val block = MessageBlock(MessageBlock.Type.TEXT, "hello")
        val json = objectMapper.writeValueAsString(block)

        assertThat(json).contains("text")
        assertThat(json).isEqualTo("{\"type\":\"text\",\"value\":\"hello\"}")
    }

}