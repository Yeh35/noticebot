package com.yeh35.noticebot.domain.accout.dao

import com.yeh35.noticebot.domain.accout.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AccountRepository : JpaRepository<Account, Long> {

    fun findByUsername(username: String): Optional<Account>

}