package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.annotation.JsonCreator

enum class ChatType {
    GROUP,
    USER_CHAT;

    companion object {

        @JvmStatic
        @JsonCreator
        fun fromJson(chatType: String): ChatType {
            return when (chatType) {
                "group" -> GROUP
                "userChat" -> USER_CHAT
                else -> {
                    throw RuntimeException("${chatType}은 존재하지 않는 형태입니다.")
                }
            }
        }
    }
}