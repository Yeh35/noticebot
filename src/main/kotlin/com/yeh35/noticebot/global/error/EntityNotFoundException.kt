package com.yeh35.noticebot.global.error

open class EntityNotFoundException(message: String) : BusinessException(message, ErrorCode.ENTITY_NOT_FOUND)