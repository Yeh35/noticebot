package com.yeh35.noticebot.channel.dto

class GroupDto(
    val id: String,
    val channelId: String,
    val name: String,
    val scope: String,
    val managerIds: ArrayList<String>,
    val createdAt: Long,
    val updatedAt: Long,
    val active: Boolean
)