package com.yeh35.noticebot.channel.dto

import com.yeh35.noticebot.channel.model.*


class WebhookMessageDto {

    data class RequestDto(
        val event: WebhookEvent,
        val type: WebhookType,
        val entity: WebhookEntityDto,
        val refers: Refers
    )

    data class Refers (
        var manager: ManagerDto,
        var group: GroupDto
    )
}


