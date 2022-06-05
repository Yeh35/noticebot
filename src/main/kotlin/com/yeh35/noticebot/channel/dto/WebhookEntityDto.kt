package com.yeh35.noticebot.channel.dto

import com.yeh35.noticebot.channel.model.ChatType
import com.yeh35.noticebot.channel.model.MessageBlock
import com.yeh35.noticebot.channel.model.PersonType

data class WebhookEntityDto(
    val chatKey: String,
    val id: String,
    val mainKey: String,
    val root: Boolean,
    val channelId: String,
    val chatType: ChatType,
    val chatId: String,
    val personType: PersonType,
    val personId: String,
    val requestId: String,
    val createdAt: Long,
    val version: Long,
    val blocks: List<MessageBlock> = listOf(),
    val plainText: String,
    val updatedAt: Long,
    val threadMsg: Boolean,
    val broadcastedMsg: Boolean
)