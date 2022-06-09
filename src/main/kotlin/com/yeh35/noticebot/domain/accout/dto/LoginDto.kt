package com.yeh35.noticebot.domain.accout.dto

import javax.validation.constraints.NotNull

class LoginDto(
    @field:NotNull
    var username: String?,

    @field:NotNull
    var password: String?,
) {

}
