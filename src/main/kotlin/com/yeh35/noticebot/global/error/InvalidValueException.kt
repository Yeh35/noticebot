package com.yeh35.noticebot.global.error

open class InvalidValueException : BusinessException {
    constructor(message: String) : super(message, ErrorCode.INVALID_INPUT_VALUE) {}
    constructor(message: String, errorCode: ErrorCode) : super(message, errorCode) {}
}