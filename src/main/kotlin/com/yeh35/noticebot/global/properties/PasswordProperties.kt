package com.yeh35.noticebot.global.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "password")
class PasswordProperties(
    val pepper: String,
    val saltSize: Int
)
