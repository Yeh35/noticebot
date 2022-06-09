package com.yeh35.noticebot.domain.accout.application

import com.yeh35.noticebot.domain.accout.dao.AccountRepository
import com.yeh35.noticebot.domain.accout.dto.CreateAccountDto
import com.yeh35.noticebot.global.error.InvalidValueException
import com.yeh35.noticebot.global.help.EncryptHandler
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class AccountService(
    private val accountRepository: AccountRepository,
    private val encryptHandler: EncryptHandler
) {

    @Transactional
    fun createUser(
        createDto: CreateAccountDto.RequestDto
    ) {
        val byUsername = accountRepository.findByUsername(createDto.username!!)
        if (byUsername.isPresent) {
            throw InvalidValueException("${createDto.username!!}는 이미 존재하는 username입니다.")
        }

        val user = createDto.toUser(encryptHandler)
        accountRepository.save(user)
    }



}
