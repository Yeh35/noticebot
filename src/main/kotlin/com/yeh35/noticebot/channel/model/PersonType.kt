package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

enum class PersonType {
    MANAGER,
    BOT,
    USER;

    companion object {

        @JvmStatic
        @JsonCreator
        fun fromJson(@JsonProperty personType: String): PersonType {
            return when (personType) {
                "manager" -> MANAGER
                "bot" -> BOT
                "user" -> USER
                else -> {
                    throw RuntimeException("${personType}은 존재하지 않는 형태입니다.")
                }
            }
        }
    }
}