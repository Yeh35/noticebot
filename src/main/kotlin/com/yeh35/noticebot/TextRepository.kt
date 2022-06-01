package com.yeh35.noticebot

import org.springframework.data.jpa.repository.JpaRepository

interface TextRepository : JpaRepository<TextEntity, Long> {
}