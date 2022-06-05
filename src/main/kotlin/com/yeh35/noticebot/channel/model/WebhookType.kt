package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.annotation.JsonCreator

enum class WebhookType {
    MESSAGE,
    USER_CHAT;

    companion object {

        @JvmStatic
        @JsonCreator
        fun fromJson(type: String): WebhookType {
            return when (type) {
                "message" -> MESSAGE
                "UserChat" -> USER_CHAT
                else -> {
                    throw RuntimeException("${type}은 존재하지 않는 형태입니다.")
                }
            }
        }
    }
}