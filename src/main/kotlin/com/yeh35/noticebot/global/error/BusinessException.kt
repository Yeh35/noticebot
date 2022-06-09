package com.yeh35.noticebot.global.error

open class BusinessException : RuntimeException {
    var errorCode: ErrorCode
        private set

    constructor(message: String, errorCode: ErrorCode) : super(message) {
        this.errorCode = errorCode
    }

    constructor(errorCode: ErrorCode) : super(errorCode.defaultMessage) {
        this.errorCode = errorCode
    }
}