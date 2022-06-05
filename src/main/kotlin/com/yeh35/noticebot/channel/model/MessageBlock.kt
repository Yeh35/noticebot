package com.yeh35.noticebot.channel.model

/**
 * 채널톡 문서에서 말하는 block
 */
data class MessageBlock(
    var type: String,
    var value: String
) {

    enum class Type {

    }

}