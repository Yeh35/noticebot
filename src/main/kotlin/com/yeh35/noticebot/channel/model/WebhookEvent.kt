package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

enum class WebhookEvent {
    CREATE,
    UPDATE,
    PUSH;

    companion object {

        @JvmStatic
        @JsonCreator
        fun fromJson(event: String): WebhookEvent {
            return when (event) {
                "create" -> CREATE
                "update" -> UPDATE
                "push" -> PUSH
                else -> {
                    throw RuntimeException("${event}은 존재하지 않는 형태입니다.")
                }
            }
        }
    }
}