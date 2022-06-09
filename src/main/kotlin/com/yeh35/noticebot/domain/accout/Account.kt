package com.yeh35.noticebot.domain.accout

import javax.persistence.*

@Entity
class Account private constructor(
    username: String,
    password: String,
    role: AccountRole,
    name: String,
    marketable: Boolean
) {

    @Id
    @GeneratedValue
    @Column(name = "account_id", updatable = false)
    var id: Long = 0
        private set

    var username: String = username
        private set

    var password: String = password
        private set

    @Enumerated(EnumType.STRING)
    var role: AccountRole = role
        private set

    var name: String = name
        private set

    var marketable: Boolean = marketable
        private set

    companion object {

        fun createUser(username: String, password: String, name: String, marketable: Boolean): Account {
            return Account(
                username = username,
                password = password,
                name = name,
                role = AccountRole.USER,
                marketable = marketable
            )
        }

        fun createAdmin(username: String, password: String, name: String): Account {
            return Account(
                username = username,
                password = password,
                name = name,
                role = AccountRole.ADMIN,
                marketable = true
            )
        }
    }
}