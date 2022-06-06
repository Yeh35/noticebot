package com.yeh35.noticebot

import com.yeh35.noticebot.channel.dto.WebhookMessageDto
import org.jboss.logging.Logger
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloApi(
    private val textRepository: TextRepository
) {

    private val logger = Logger.getLogger(this::class.java)


    @PostMapping("/hello")
    fun hello(@RequestBody body: WebhookMessageDto.RequestDto) : ResponseEntity<String> {
        logger.info("hello")
        logger.info("Body: $body")

        val replyBody = "{\n" +
                "  \"blocks\": [\n" +
                "    {\n" +
                "      \"type\": \"text\",\n" +
                "      \"value\": \"This is <b>bold</b>, <i>italic</i>, and <b><i>bold+italic</i></b>. Emoji should be in shortcode :+1: :100: \"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"text\",\n" +
                "      \"value\": \"<link type=\\\"manager\\\" value=\\\"managerId_goes_here\\\">@username</link>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"text\",\n" +
                "      \"value\": \"This is a url <link type=\\\"url\\\" value=\\\"https://channel.io\\\">https://channel.io</link>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"text\",\n" +
                "      \"value\": \"This is a link <link type=\\\"url\\\" value=\\\"https://channel.io\\\">Channel</link>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"code\",\n" +
                "      \"value\": \"<script>ChannelIO('boot')</script>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"bullets\",\n" +
                "      \"blocks\": [\n" +
                "        {\n" +
                "          \"type\": \"text\",\n" +
                "          \"value\": \"Bulleted text goes here\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"type\": \"text\",\n" +
                "          \"value\": \"Next bulleted text goes here\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}"

        return ResponseEntity<String>(
            replyBody,
            HttpHeaders().apply {
                set("x-quick-reply", "true")
                set("x-bot-name", "test")
            },
            HttpStatus.OK,
        )
    }

    @RequestMapping("/echo/{text}")
    fun echo(@PathVariable text: String): String {
        val textEntity = textRepository.save(TextEntity(text))
        return textEntity.text
    }
}