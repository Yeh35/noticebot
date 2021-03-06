package com.yeh35.noticebot.channel.dto

data class ManagerDto(
    val id: String,
    val channelId: String,
    val accountId: String,
    val username: String,
    val name: String,
    val showDescriptionToFront: Boolean,
    val email: String,
    val showEmailToFront: Boolean,
    val mobileNumber: String,
    val showMobileNumberToFront: Boolean,
    val role: String,
    val removed: Boolean,
    val createdAt: Long = 0,
    val displayAsChannel: Boolean,
    val defaultGroupWatch: String,
    val defaultDirectChatWatch: String,
    val defaultUserChatWatch: String,
    val chatAlertSound: String,
    val operatorScore: Double,
    val touchScore: Double,
    val operatorEmailReminder: Boolean,
    val operator: Boolean,
    val operatorScheduling: Boolean,
    val avatarUrl: String,
    val managerId: String,
)