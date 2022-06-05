package com.yeh35.noticebot.channel.domain

class Manager {
    var id: String? = null
    var channelId: String? = null
    var accountId: String? = null
    var username: String? = null
    var name: String? = null
    var showDescriptionToFront = false
    var email: String? = null
    var showEmailToFront = false
    var mobileNumber: String? = null
    var showMobileNumberToFront = false
    var role: String? = null
    var removed = false
    var createdAt: Long = 0
    var displayAsChannel = false
    var defaultGroupWatch: String? = null
    var defaultDirectChatWatch: String? = null
    var defaultUserChatWatch: String? = null
    var chatAlertSound: String? = null
    var operatorScore = 0.0
    var touchScore = 0.0
    var operatorEmailReminder = false
    var operator = false
    var operatorScheduling = false
    var avatarUrl: String? = null
    var managerId: String? = null
}