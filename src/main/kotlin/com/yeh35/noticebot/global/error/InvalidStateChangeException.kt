package com.yeh35.noticebot.global.error

open class InvalidStateChangeException : BusinessException {
    constructor(message: String) : super(message, ErrorCode.INVALID_STATE_CHANGE) {}
    constructor(message: String, errorCode: ErrorCode) : super(message, errorCode) {}
}