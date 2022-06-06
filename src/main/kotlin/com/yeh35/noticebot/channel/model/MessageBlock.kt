package com.yeh35.noticebot.channel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
 * 채널톡 문서에서 말하는 block
 */
data class MessageBlock(
    var type: Type,
    var value: String
) {

    enum class Type(val jsonName: String) {
        BULLETS("bullets"),
        CODE("code"),
        TEXT("text");

        @JsonValue
        fun getJson(): String {
            return jsonName
        }

        companion object {
            @JvmStatic
            @JsonCreator
            fun fromJson(type: String): Type {
                return when (type) {
                    TEXT.jsonName -> TEXT
                    CODE.jsonName -> CODE
                    BULLETS.jsonName -> BULLETS
                    else -> {
                        throw RuntimeException("${type}은 존재하지 않는 형태입니다.")
                    }
                }
            }
        }


    }

}