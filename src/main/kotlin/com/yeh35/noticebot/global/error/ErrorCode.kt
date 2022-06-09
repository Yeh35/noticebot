package com.yeh35.noticebot.global.error

enum class ErrorCode(
    val status: Int,
    val code: String,
    val defaultMessage: String,
) {
    // Common
    INVALID_INPUT_VALUE(400, "C001", " Invalid Input Value"),
    METHOD_NOT_ALLOWED(405, "C002", " Invalid Input Value"),
    ENTITY_NOT_FOUND(400, "C003", " Entity Not Found"),
    INTERNAL_SERVER_ERROR(500, "C004", "Server Error"),
    INVALID_TYPE_VALUE(400, "C005", " Invalid Type Value"),
    HANDLE_AUTH_NOT_FOUND(401, "C006", "Authentication not Found"),
    HANDLE_ACCESS_DENIED(403, "C007", "Access is Denied"),
    INVALID_STATE_CHANGE(400, "C008", " Invalid Stage Change"),

}