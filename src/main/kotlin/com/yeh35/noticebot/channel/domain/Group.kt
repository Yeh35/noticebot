package com.yeh35.noticebot.channel.domain

class Group {
    var id: String
    var channelId: String
    var name: String
    var scope: String
    var managerIds: ArrayList<String>
    var createdAt: Long = 0
    var updatedAt: Long = 0
    var active = false

    constructor(
        id: String,
        channelId: String,
        name: String,
        scope: String,
        managerIds: ArrayList<String>,
        createdAt: Long,
        updatedAt: Long,
        active: Boolean
    ) {
        this.id = id
        this.channelId = channelId
        this.name = name
        this.scope = scope
        this.managerIds = managerIds
        this.createdAt = createdAt
        this.updatedAt = updatedAt
        this.active = active
    }
}