package com.yeh35.noticebot.domain.accout.dto

import com.yeh35.noticebot.domain.accout.domain.Account
import com.yeh35.noticebot.global.help.EncryptHandler
import javax.validation.constraints.NotNull

class CreateAccountDto {

    data class RequestDto(
        @field:NotNull
        var name: String?,

        @field:NotNull
        var username: String?,

        @field:NotNull
        var password: String?,

        @field:NotNull
        var marketable: Boolean?
    ) {

        fun toUser(encryptHandler: EncryptHandler): Account {
            return Account.createUser(
                username = username!!,
                password = encryptHandler.encrypt(password!!),
                name = name!!,
                marketable = marketable!!
            )
        }

    }

}
