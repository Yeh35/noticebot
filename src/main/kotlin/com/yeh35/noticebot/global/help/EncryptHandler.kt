package com.yeh35.noticebot.global.help

import com.yeh35.noticebot.global.properties.PasswordProperties
import org.springframework.security.crypto.bcrypt.BCrypt
import org.springframework.stereotype.Component

@Component
class EncryptHandler(
    private val passwordProperties: PasswordProperties
) {

    fun encrypt(password: String): String {
        return BCrypt.hashpw(passwordProperties.pepper + password, BCrypt.gensalt(passwordProperties.saltSize))
    }

    fun isMatch(password: String, hashed: String, pepper: String = passwordProperties.pepper): Boolean {
        return BCrypt.checkpw(pepper + password, hashed)
    }
}