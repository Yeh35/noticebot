package com.yeh35.noticebot.domain.accout.api

import com.yeh35.noticebot.domain.accout.application.AccountService
import com.yeh35.noticebot.domain.accout.dto.CreateAccountDto
import com.yeh35.noticebot.domain.accout.dto.LoginDto
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/account")
@RestController
class AccountApi(
    private val accountService: AccountService
) {

    @PostMapping
    fun signup(
        @Validated @RequestBody createDto: CreateAccountDto.RequestDto
    ) {
        accountService.createUser(createDto)
    }

    @PostMapping("/login")
    fun login(
        @Validated @RequestBody loginDto: LoginDto
    ) {

    }

}